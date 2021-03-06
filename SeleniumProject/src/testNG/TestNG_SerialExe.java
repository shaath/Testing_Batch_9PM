package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import methods.GenericMethods;

public class TestNG_SerialExe extends GenericMethods {

	@Test(dataProvider = "data")
	public void exe(String br, String url)
	{
		System.out.println(br + "---" + url);
		Br_Launch(br);
		
		driver.get(url);
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] x = new Object[3][2];
		
		x[0][0] = "firefox";
		x[0][1] = "http://google.com";
		
		x[1][0] = "chrome";
		x[1][1] = "https://twitter.com";
		
		x[2][0] = "edge";
		x[2][1] = "https://bing.com";
		
		return x;
	}
}
