package day15;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class WebDriverWaitEg {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch_9PM\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(120))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(org.openqa.selenium.NoSuchElementException.class);
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
	
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
	
		alt.dismiss();
		
		driver.navigate().to("http://demo.automationtesting.in/ProgressBar.html");
		
		driver.findElement(By.xpath("//button[@id='cricle-btn']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='100']")));
		
		System.out.println(driver.findElement(By.xpath("//div[text()='100']")).isDisplayed());
	}

}
