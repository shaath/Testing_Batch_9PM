package day11;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowshandlingEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch_9PM\\Jars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://gmail.com");
		
		String gmail_wId = driver.getWindowHandle();
		
//		System.out.println(gmail_wId);
		
		driver.findElement(By.linkText("Privacy")).click();
		Thread.sleep(5000);
		Set<String> s = driver.getWindowHandles();
		
		for (String wId : s)
		{
			System.out.println(wId);
			
			driver.switchTo().window(wId);
			String title = driver.getTitle();
			System.out.println(title);
			if (title.contains("Privacy Policy"))
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				break;
			}
		}
		
		driver.switchTo().window(gmail_wId);
		driver.findElement(By.xpath("//button[@jsname='Cuz2Ue']")).click();
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.navigate().to("https://twitter.com");
		
		driver.quit();

	}

}
