package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoFillersEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch_9PM\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://redbus.in");
		String wid = driver.getWindowHandle();
		
		driver.findElement(By.id("src")).sendKeys("chi");
		Thread.sleep(5000);

		List<WebElement> cities = driver.findElements(By.xpath("//section[@id='search']//ul/li"));
		
		System.out.println(cities.size());
		
		for (int i = 0; i < cities.size(); i++)
		{
			String city = cities.get(i).getText();
			System.out.println(city);
			
			if (city.equalsIgnoreCase("Chidambaram"))
			{
				cities.get(i).click();
				break;
			}
		}
		
		driver.switchTo().window(wid);
		driver.close();
	}

}
