package com.SeleniumProject.JavaProgrammes;

public class SplitEg {

	public static void main(String[] args) {
		
		String x = "I am learning Selenium with Java";
		
		String[] sArray = x.split(" ");
		
		System.out.println(sArray.length);
		
//		System.out.println(sArray[2]);
		
		for(int i = 0; i < sArray.length; i++)
		{
			System.out.println(sArray[i]);
		}

	}

}
