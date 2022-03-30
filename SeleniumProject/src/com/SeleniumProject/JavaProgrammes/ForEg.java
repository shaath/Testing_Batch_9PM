package com.SeleniumProject.JavaProgrammes;

public class ForEg {

	public static void main(String[] args) {
		
		//Priniting "Hi" 10 times in the console
		  //initialization; condition; incrementor/decrementor
//		for(int i = 1; i <= 10; i++)		//i = i + 1;
//		{
//			System.out.println(i);
//			System.out.println("Hi");
//		}
		
		//Printing 1 to 100 in console
		
//		for(int index = 1; index <= 100; index++)
//		{
//			System.out.println(index);
//			
//			if(index == 75)
//			{
//				break;
//			}
//		}
		
		//Printing 100 to 1 in console
		
//		for(int j = 100; j >= 1; j--)
//		{
//			System.out.println(j);
//			
//			if(j == 45)
//			{
//				break;
//			}
//		}
		
		//Printing a to z in console
			//initialization; condition; incrementor / decrementor
		for(char ch = 'a'; ch <= 'z'; ch++)		//ASCII codes --->  lower case leters --97 to 122
												//				   upper case lettr ---65 to 90	
		{
			System.out.println(ch);
			System.out.println((int) ch);
		}
	}

}
