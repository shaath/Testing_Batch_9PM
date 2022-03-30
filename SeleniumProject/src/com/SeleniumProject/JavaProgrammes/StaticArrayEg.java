package com.SeleniumProject.JavaProgrammes;

public class StaticArrayEg {

	public static void main(String[] args) {
		
		int[] salary = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000};
		
		int len = salary.length;
		System.out.println(len);
		
//		System.out.println( salary[2] );
		
//		for(int i = 0; i < len; i++)
//		{
//			int data = salary[i];
//			System.out.println(data);
//		}
		
		for(int data:salary)
		{
			System.out.println(data);
		}
		
	}

}
