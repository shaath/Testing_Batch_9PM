package com.SeleniumProject.JavaProgrammes;

public class ReverseStringEg {

	public static void main(String[] args) {
		
		String x = "malayalam";  // muineleS
		String rev = "";
		int len = x.length();
		
		for (int i = len - 1; i >= 0; i--)
		{
//			System.out.print(x.charAt(i));
			rev = rev + x.charAt(i);    
		}
		System.out.println(rev);
		
		if (x.equalsIgnoreCase(rev)) {
			System.out.println("Given String a polindrome");
		}
		else{
			System.out.println("Given String is not a polindrome");
		}
	}

}
