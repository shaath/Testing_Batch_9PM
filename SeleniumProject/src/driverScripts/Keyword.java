package driverScripts;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import methods.BusinessMethods;

public class Keyword {

	public static void main(String[] args) throws IOException, InterruptedException {
		String xlPath = "D:\\Testing_Batch_9PM\\Workspace\\SeleniumProject\\src\\com\\SeleniumProject\\inputdata\\Keyword.xlsx";
		String xlOut = "D:\\Testing_Batch_9PM\\Workspace\\SeleniumProject\\src\\com\\SeleniumProject\\results\\keyres1.xlsx";
		
		XSSFWorkbook wb = new XSSFWorkbook(xlPath);
		XSSFSheet TC_Sht = wb.getSheet("Testcase");
		XSSFSheet TS_Sht = wb.getSheet("Teststeps");
		XSSFSheet TD_Sht = wb.getSheet("TestData");
		
		int TC_Sht_Rc = TC_Sht.getLastRowNum();
		int TS_Sht_Rc = TS_Sht.getLastRowNum();
		
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
							String f = TD_Sht.getRow(1).getCell(4).getStringCellValue();
							String l = TD_Sht.getRow(1).getCell(5).getStringCellValue();
							String eid = TD_Sht.getRow(1).getCell(6).getStringCellValue();
							res = bm.Org_EmpReg(f, l, eid);
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
