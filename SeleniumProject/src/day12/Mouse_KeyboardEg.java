package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_KeyboardEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch_9PM\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://faceboook.com");

		WebElement email = driver.findElement(By.id("email"));
		
		Actions act = new Actions(driver);
		
		act.click(email).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.chord("Selenium")).perform();
		Thread.sleep(5000);
		act.doubleClick(email).perform();
	}

}
