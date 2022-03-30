package com.SeleniumProject.JavaProgrammes;

public class TwoDimArrayEg {

	public static void main(String[] args) {
		
		Object[][] x = new Object[4][3];

		System.out.println("Rows length is "+x.length);
		System.out.println("Columns length for 0th indexed row "+x[0].length);
		
		x[1][0] = 2;
		x[1][1] = "Shiva";
		
//		System.out.println(x[0][1]);
		
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[i].length; j++)
			{
				System.out.print(x[i][j]);
			}
		}
		
	}

}
