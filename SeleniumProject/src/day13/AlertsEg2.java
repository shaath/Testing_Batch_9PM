package day13;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsEg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch_9PM\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		Thread.sleep(3000);
		alt.dismiss();
	}

}
