package com.SeleniumProject.JavaProgrammes;

import java.util.HashSet;

public class HashsetEg {

	public static void main(String[] args) {
		
		HashSet<Object> h = new HashSet<>();
		
		h.add("Selenium");
		h.add("Boll");
		h.add("Apple");
		h.add(30000);
		h.add('M');
		h.add(true);
		h.add("Selenium");
		
		for(Object data: h)
		{
			System.out.println(data);
		}

	}

}
