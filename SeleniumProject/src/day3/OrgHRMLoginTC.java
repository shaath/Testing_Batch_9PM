package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrgHRMLoginTC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch_9PM\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver", "D:\\Testing_Batch_9PM\\Jars/chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.edge.driver", "D:\\Testing_Batch_9PM\\Jars\\msedgedriver.exe");
//		EdgeDriver driver = new EdgeDriver();
		
//		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.get("http://orangehrm.qedgetech.com");

		WebElement username = driver.findElement(By.id("txtUsername"));
//		username.click();
//		Thread.sleep(5000);
//		username.sendKeys("Admin");
		username.sendKeys("Admin");
//		Thread.sleep(5000);
//		username.clear();
		
//		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
//		driver.quit();
		
	}

}
