package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestNG_Master {

	public WebDriver driver;
	public String expval, actval;
	public String url = "http://orangehrm.qedgetech.com";
	public String u = "Admin", p = "Qedge123!@#";
	public String f = "Swamy1", l = "N1", eid = "SN4357711";
	public String ename = f+" "+l, uname = "A"+f+l+"947222132", pwd = "Testsample@987612345098124";
	
	@BeforeTest
	public void LaunchApp()
	{
		expval = "LOGIN";
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch_9PM\\Jars/geckodriver.exe");
		driver = new FirefoxDriver();	
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		
		Assert.assertEquals(expval, actval, "Launch App Failed");
	}
	
	@BeforeMethod
	public void login() throws InterruptedException
	{
		expval = "welcome";
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		actval = driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		
		Assert.assertEquals(expval, actval, "Login Failed");
	}
	
	@AfterMethod
	public void logout()
	{
		expval = "LOGIN";
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(expval, actval, "Logout Failed");	
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}
}
