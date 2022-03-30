package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitwaitEg {

	public static void main(String[] args) {
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(360));
		
//		JavascriptExecutor je = ((JavascriptExecutor)driver);
//		je.executeScript("aerguments[0].click();", driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/91OXOR85PxL._SX3740_.jpg']")));
			
//		driver.findElement(By.xpath("//*[@id='yZkdPkDB_t4QPtCCe1MQCw']/a/div/img")).click();
		
//		driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/618B1HnAxLL._SX3740_.jpg']")).click();
		WebElement deals = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/618B1HnAxLL._SX3740_.jpg']"));
		
	    JavascriptExecutor je = (JavascriptExecutor)driver;
	    je.executeScript("arguments[0].click();", deals);
		
	}

}
