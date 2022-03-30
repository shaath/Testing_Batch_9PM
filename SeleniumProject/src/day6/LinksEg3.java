package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch_9PM\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		
		List<WebElement> links = driver.findElements(By.xpath("//table[@id='Table_011']//a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			String lname = links.get(i).getText();
			System.out.println(lname);			
			
			links.get(i).click();
			Thread.sleep(5000);
			System.out.println(driver.getTitle()+"-----"+driver.getCurrentUrl());
			
			driver.navigate().back();
			Thread.sleep(5000);
			
			links = driver.findElements(By.xpath("//table[@id='Table_011']//a"));
		}

	}

}
