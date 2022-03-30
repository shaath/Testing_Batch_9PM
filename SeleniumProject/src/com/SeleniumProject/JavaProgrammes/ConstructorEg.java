package com.SeleniumProject.JavaProgrammes;

public class ConstructorEg 
{
	
	String course = null;
	
	ConstructorEg()
	{
		System.out.println("This is ConstructorEg code");
	}
	
	ConstructorEg(String course)
	{
		display(course);
	}

	public void display(String course)
	{
		System.out.println("Selected course is "+ course);
	}
}
