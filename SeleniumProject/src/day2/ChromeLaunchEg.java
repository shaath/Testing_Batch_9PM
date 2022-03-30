package day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLaunchEg {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "D:\\Testing_Batch_9PM\\Jars/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://twitter.com");
		
		driver.manage().window().maximize();
	}

}
