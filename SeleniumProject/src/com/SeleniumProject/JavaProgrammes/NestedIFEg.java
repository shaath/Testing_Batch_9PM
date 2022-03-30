package com.SeleniumProject.JavaProgrammes;

public class NestedIFEg {

	public static void main(String[] args) {	
		int a = 10;
		int b = 200;
		int c = 200;
		
		if( a > b &&  a > c)
		{
			System.out.println("A is Greater");
		}
		else if (b > a && b > c)
		{
			System.out.println("B is Greater");
		}
		else if (c > a && c > b) 
		{
			System.out.println("C is Greater");
		}
		else
		{
			System.out.println("Do not give duplicate values");
		}
	}

}
