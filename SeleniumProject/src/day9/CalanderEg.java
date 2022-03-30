package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalanderEg {

	public static void main(String[] args) throws InterruptedException {
		
		String date = "05/January/2023";
		String[] split = date.split("/");
		String exp_day = split[0];
		String exp_month_year = split[1]+" "+split[2];
		System.out.println(exp_day+"----"+exp_month_year);
		
		
		WebDriverManager.firefoxdriver().setup();
//		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch_9PM\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.className("closeit")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[local-name()='svg' and @fill='currentColor'])[1]")).click();
		
		String month_year = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]")).getText();
		System.out.println(month_year);
		
		while(!exp_month_year.equalsIgnoreCase(month_year))
		{
			driver.findElement(By.xpath("//*[local-name()='svg' and @data-testid='rightArrow']")).click();
			month_year = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]")).getText();
		}

		List<WebElement> cells = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[contains(@class,'DayPicker-Day') and @aria-disabled='false']"));
		System.out.println(cells.size());
		
		for (int i = 0; i < cells.size(); i++) {
			String date_details = cells.get(i).getAttribute("aria-label");
			System.out.println(date_details);
			
			if (date_details.contains(exp_day))
			{
				cells.get(i).click();
				break;
			}
		}
	}

}
