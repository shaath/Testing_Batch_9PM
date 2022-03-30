package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownEg {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/");
		
		WebElement drop = driver.findElement(By.id("drlist"));
		
		Select s = new Select(drop);

		s.selectByIndex(3);
		Thread.sleep(5000);
		s.selectByValue("Bank24");
		Thread.sleep(5000);
		s.selectByVisibleText("Test123");
	}

}
