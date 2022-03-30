package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropEg2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch_9PM\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/draggable/");
		
		WebElement iframe = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(iframe);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		Actions act = new Actions(driver);
		
//		act.dragAndDropBy(drag, 368, 9).perform();
		
		act.clickAndHold(drag).moveByOffset(368, 9).build().perform();

	}

}
