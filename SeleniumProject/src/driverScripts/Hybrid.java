package driverScripts;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import methods.BusinessMethods;

public class Hybrid {

	public static void main(String[] args) throws IOException, InterruptedException {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyHHmmss");
		String d = sdf.format(date);
		
		String Pr_path = System.getProperty("user.dir");
		System.out.println(Pr_path);
		String xlPath = Pr_path + "\\src\\com\\SeleniumProject\\inputdata\\Hybrid.xlsx";
		String xlOut = Pr_path + "\\src\\com\\SeleniumProject\\results\\HybridRes"+d+".xlsx";
		
		XSSFWorkbook wb = new XSSFWorkbook(xlPath);
		XSSFSheet TC_Sht = wb.getSheet("Testcase");
		XSSFSheet TS_Sht = wb.getSheet("Teststeps");
		XSSFSheet TD_Sht = wb.getSheet("TestData");
		XSSFSheet EmpReg_Sht = wb.getSheet("EmpReg");
		
		int TC_Sht_Rc = TC_Sht.getLastRowNum();
		int TS_Sht_Rc = TS_Sht.getLastRowNum();
		int EmpReg_Sht_Rc = EmpReg_Sht.getLastRowNum();
		
		BusinessMethods bm = new BusinessMethods();
		String res = "";
		for (int i = 1; i <= TC_Sht_Rc; i++)
		{
			TC_Sht.getRow(i).createCell(3);
			String exe = TC_Sht.getRow(i).getCell(2).getStringCellValue();
			
			if (exe.equalsIgnoreCase("Y")) {
				String TC_Sht_TC_Id = TC_Sht.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= TS_Sht_Rc; j++) {
					String TS_Sht_TC_Id = TS_Sht.getRow(j).getCell(0).getStringCellValue();
					
					if (TC_Sht_TC_Id.equalsIgnoreCase(TS_Sht_TC_Id)) {
						String key = TS_Sht.getRow(j).getCell(3).getStringCellValue();
						
						switch(key)
						{
						case "Launch":
							String br = TD_Sht.getRow(1).getCell(0).getStringCellValue();
							String url = TD_Sht.getRow(1).getCell(1).getStringCellValue();
							res = bm.Org_Launch(br, url);
							break;
						case "login":
							String u = TD_Sht.getRow(1).getCell(2).getStringCellValue();
							String p = TD_Sht.getRow(1).getCell(3).getStringCellValue();
							res = bm.Org_Login(u, p);
							break;
						case "logout":
							res = bm.Org_Logout();
							bm.Org_Close();
							break;
						case "Empreg":
							for (int k = 1; k <= EmpReg_Sht_Rc; k++) {
								String f = EmpReg_Sht.getRow(k).getCell(0).getStringCellValue();
								String l =  EmpReg_Sht.getRow(k).getCell(1).getStringCellValue();
								String eid =  EmpReg_Sht.getRow(k).getCell(2).getStringCellValue();
								res = bm.Org_EmpReg(f, l, eid);
								EmpReg_Sht.getRow(k).createCell(3).setCellValue(res);
							}
							
							break;
						case "Usereg":
							String ename = TD_Sht.getRow(1).getCell(7).getStringCellValue();
							String uname = TD_Sht.getRow(1).getCell(8).getStringCellValue();
							String pwd = TD_Sht.getRow(1).getCell(9).getStringCellValue();
							res = bm.Org_userReg(ename, uname, pwd);
							break;
						case "Ulogin":
							String un = TD_Sht.getRow(1).getCell(8).getStringCellValue();
							String pd = TD_Sht.getRow(1).getCell(9).getStringCellValue();
							res = bm.Org_Login(un, pd);
							break;
						}
						
						TS_Sht.getRow(j).createCell(4).setCellValue(res);
						
						if (!TC_Sht.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail")) 
						{
							TC_Sht.getRow(i).getCell(3).setCellValue(res);
						}
					}
				}
			}
			else{
				TC_Sht.getRow(i).getCell(3).setCellValue("BLOCKED");
			}
		}
		
		FileOutputStream fo = new FileOutputStream(xlOut);
 		wb.write(fo);
 		wb.close();

	}

}
