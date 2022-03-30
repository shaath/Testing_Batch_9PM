package day6;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreeshotEg {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch_9PM\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("D:\\Testing_Batch_9PM\\Workspace\\SeleniumProject\\src\\screenshots\\google.png"));

		File gmail = driver.findElement(By.linkText("Gmail")).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(gmail, new File("D:\\Testing_Batch_9PM\\Workspace\\SeleniumProject\\src\\screenshots\\gmail.jpg"));
	}

}
