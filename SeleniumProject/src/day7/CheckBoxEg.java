package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch_9PM\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://echoecho.com/htmlforms09.htm");
		
		WebElement check = driver.findElement(By.name("option1"));
		
//		System.out.println(check.isDisplayed()); // -----> true
		
//		System.out.println(check.isEnabled()); // -----> true
		
//		System.out.println(check.isSelected());//------>false
		
		if (!check.isSelected())
		{
			check.click();
		}

	}

}
