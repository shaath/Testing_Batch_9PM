package com.SeleniumProject.JavaProgrammes;

import java.util.ArrayList;

public class ArraylistEg {

	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<>();
		
		//Writing the data into arraylist
		
		list.add("Selenium");
		list.add(70000);
		list.add(true);
		list.add(444.44);
		list.add('M');
		list.add("Apple");
		list.add("Selenium");
		list.add(2, "Manual");
		list.add('A');
		list.add('X');
		list.add(10, "Boll");
		
//		list.remove(2);		
//		list.remove("Selenium");
		
//		list.clear();
		
		list.set(1, "Terminated");
				
		//Finding the size of an arraylist	
		System.out.println(list.size());
		
		//Reading the data from arraylist
//		System.out.println(list.get(2));
		
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i));			
		}
	}

}
