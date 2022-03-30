package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@Test(priority = 2)
	public void function1()
	{
		System.out.println("This Function1 code");
	}
	
	@Test(priority = 1)
	public void function2()
	{
		System.out.println("This is Function2 code");
	}
	
	@Test(priority = 0)
	public void function3()
	{
		System.out.println("This is Function3 code");
	}
	
	@Test(priority = 3)
	public void apple()
	{
		System.out.println("This is Apple code");
	}
	
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("This is Before Method Code");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("This is After Method Code");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("This is Before Class Code");
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("This is After Class Code");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("This is Before Test Code");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("This is After Test Code");
	}
}
