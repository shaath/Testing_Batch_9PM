package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonsEg {

	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch_9PM\\Jars/geckodriver.exe");

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> radios = driver.findElements(By.xpath("//td[@class='table5']/input"));
		System.out.println(radios.size());
		
		for (int i = 0; i < radios.size(); i++) {
			
			String rName = radios.get(i).getAttribute("value");
			System.out.println(rName);
			
			if (rName.equalsIgnoreCase("Milk")) {
				radios.get(i).click();
			}
			else if (rName.equalsIgnoreCase("water")) {
				radios.get(i).click();
			}	
		}

	}

}
