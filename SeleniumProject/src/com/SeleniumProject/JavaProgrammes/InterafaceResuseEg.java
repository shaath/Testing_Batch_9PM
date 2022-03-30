package com.SeleniumProject.JavaProgrammes;

public class InterafaceResuseEg {

	public static void main(String[] args) {
		
		InterfaceEg ime1 = new InterfaceImplementsEg1();
		ime1.Vehicle();
		
		
		InterfaceEg ime2 = new InterfaceImplementsEg2();
		ime2.Vehicle();
	}

}
