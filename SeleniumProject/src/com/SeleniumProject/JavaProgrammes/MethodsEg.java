package com.SeleniumProject.JavaProgrammes;

public class MethodsEg {
	public static String course = "Selenium";
	public int salary = 80000;
	
	public static void main(String[] args)
	{
		Function1();
		String res = Function2();
		System.out.println(res);
		
		MethodsEg me = new MethodsEg();
		me.Function3();
		
		boolean flag = me.Function4();
		System.out.println(flag);
	}

	//static method without returning value
	public static void Function1()
	{
		System.out.println(course);
		System.out.println("This is Function1 code");
	}
	
	//Static method with returning value
	public static String Function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
	}
	
	// Non static method without returning any value
	public void Function3()
	{
		System.out.println(course);
		System.out.println(salary);
		System.out.println("This is Function3 code");
	}
	
	//Non static method with returning value
	public boolean Function4()
	{
		String x = "Apple";
		System.out.println("This is Function4 code");
		System.out.println(x);
		return true;
	}
	
	public int sum(int a, int b)
	{
		int c = a + b;
		return c;
	}
	
	public int sum(int a, int b , int c)
	{
		int d = a + b+ c;
		return d;
	}
}
