package com.SeleniumProject.JavaProgrammes;

public class ConstructorReuseEg {

	public static void main(String[] args) {
		
		ConstructorEg ce = new ConstructorEg();
		
		ConstructorEg ce1 = new ConstructorEg("Selenium with java");
		
		ce1.display("Python");
	}
}
