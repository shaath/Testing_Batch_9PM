package com.SeleniumProject.JavaProgrammes;

public class MethodsReuseEg {

	public static void main(String[] args)
	{	
//		MethodsEg.Function1();
		
		MethodsEg me = new MethodsEg();
		
//		boolean flag = me.Function4();
//		System.out.println(flag);
		
//		me.Function1();
		
		int res = me.sum(30, 50, 20);
		System.out.println(res);
		
	}

}
