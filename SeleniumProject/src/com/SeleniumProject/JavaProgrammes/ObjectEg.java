package com.SeleniumProject.JavaProgrammes;

public class ObjectEg {

	public static void main(String[] args) {
		
		Object[] x = {"Selenium", 500000, true, 2344223.3214, 'M'};
		
		System.out.println(x.length);
		
		for (Object data : x)
		{
			System.out.println(data);
		}

	}

}
