package day2;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeLaunchEg {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.edge.driver", "D:\\Testing_Batch_9PM\\Jars\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();

		driver.get("https://selenium.dev");
		
		//IE launch
		
		/*System.setProperty("webdriver.ie.driver", "D:\\Testing_Batch_9PM\\Jars\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("https://gmail.com");*/
		
		//Opera Browser launch
		
		/*System.setProperty("webdriver.opera.driver", "D:\\Testing_Batch_9PM\\Jars\\operadriver_win64\\operadriver.exe");
		OperaDriver driver = new OperaDriver();
		
		driver.get("http://google.com");*/
		
		//Safary Browser Launch
		
		/*System.setProperty("webdriver.safari.driver", "");
		SafariDriver driver = new SafariDriver();
		
		driver.get("https://google.com");*/
		
	}

}
