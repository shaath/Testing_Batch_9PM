package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch_9PM\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(8000);
		
		WebElement signIn = driver.findElement(By.id("nav-link-accountList"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(signIn).perform();
		Thread.sleep(5000);
		
		WebElement prime = driver.findElement(By.xpath("//span[.='Your Prime Video']"));
		
//		prime.click();
		
		act.click(prime).perform();		


	}

}
