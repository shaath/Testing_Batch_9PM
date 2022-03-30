package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import methods.BusinessMethods;

public class ExcelOps {

	public static void main(String[] args) throws IOException, InterruptedException {	
//		System.out.println(System.getProperty("user.dir"));
		String xlPath = System.getProperty("user.dir") +"\\src\\com\\SeleniumProject\\inputdata\\TestData.xlsx";
		String xlOut = System.getProperty("user.dir") +"\\src\\com\\SeleniumProject\\results\\EmpRes.xlsx";
		String res = null;
		
		FileInputStream fi = new FileInputStream(xlPath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EmpReg");
//		XSSFRow r = ws.getRow(1);
//		XSSFCell c = r.getCell(0);
		
//		System.out.println(c.getStringCellValue());
		
		int rc = ws.getLastRowNum();
		System.out.println(rc);
		
//		System.out.println(r.getLastCellNum());
		BusinessMethods bm = new BusinessMethods();
		bm.Org_Launch("firefox", "http://orangehrm.qedgetech.com");
		bm.Org_Login("Admin", "Qedge123!@#");
		
		for (int i = 1; i <= rc; i++)
		{
			XSSFRow r = ws.getRow(i);
			XSSFCell c1 = r.getCell(0);
			XSSFCell c2 = r.getCell(1);
			XSSFCell c3 = r.getCell(2);
			
			XSSFCell c4 = r.createCell(3);
			
			String f = c1.getStringCellValue();
			String l = c2.getStringCellValue();
			String eid = c3.getStringCellValue();
			
			System.out.println(f+"---"+l+"---"+eid);
			
			res = bm.Org_EmpReg(f, l, eid);
			
			c4.setCellValue(res);
		}	
		
		FileOutputStream fo = new FileOutputStream(xlOut);
		wb.write(fo);
		wb.close();
		
		bm.Org_Logout();
		bm.Org_Close();
	}

}
