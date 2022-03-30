package day14;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadEg {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch_9PM\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		driver.findElement(By.linkText("4.1.2")).click();
		Thread.sleep(10000);
			
		Runtime.getRuntime().exec("C:\\Users\\SharatChandra\\Desktop\\FileDownloadEg.exe");
	}

}
