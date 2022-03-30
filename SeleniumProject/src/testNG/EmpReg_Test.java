package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpReg_Test extends TestNG_Master{

	@Test(dataProvider = "data")
	public void empreg(String f, String l, String eid) throws InterruptedException
	{
		System.out.println(f+"---"+l+"---"+eid);
		expval = f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(eid);
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(3000);
		actval = driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(expval, actval, "Employee Registration Failed");
	}
	
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] x = new Object[4][3];
		
		x[0][0] = "Anji";
		x[0][1] = "H";
		x[0][2] = "AH3285";
		
		x[1][0] = "Ram";
		x[1][1] = "C";
		x[1][2] = "RC7645";
		
		x[2][0] = "P";
		x[2][1] = "Rama";
		x[2][2] = "PR5643";
		
		x[3][0] = "Dasarath";
		x[3][1] = "M";
		x[3][2] = "DM8574";
		
		return x;
	}
}
