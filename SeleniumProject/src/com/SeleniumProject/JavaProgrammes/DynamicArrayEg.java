package com.SeleniumProject.JavaProgrammes;

public class DynamicArrayEg {

	public static void main(String[] args) {
		
		String[] courses = new String[5];
		//Finding the length of an array
		System.out.println(courses.length);
		
		//Writing the data into an array
		
		courses[1] = "Selenium";
		courses[3] = "Manual";
		courses[1] = "Apple";
		
		//Reading the data from an array
		
//		System.out.println(courses[1]);
		
//		for (int i = 0; i < courses.length; i++) 
//		{
//			System.out.println(courses[i]);
//		}
		
		for(String data:courses)
		{
			System.out.println(data);
		}
	}
}
