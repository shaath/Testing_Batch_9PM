package com.SeleniumProject.JavaProgrammes;

import java.util.HashMap;
import java.util.Map;

public class HashMapEg {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "January");
		map.put(2, "February");
		map.put(3, "March");
		map.put(4, "April");
		map.put(5, "May");
		map.put(6, "June");
		map.put(7, "July");
		map.put(8, "August");
		map.put(9, "September");
		map.put(10, "October");
		map.put(11, "November");
		map.put(12, "December");
		
//		System.out.println(map);
		
//		map.clear();
//		map.remove(1);
//		map.replace(1, "XYZ");
		
//		System.out.println(map.get(1));
		
		for (Map.Entry<Integer, String> data : map.entrySet())
		{
			System.out.println(data.getKey() +"---"+ data.getValue());
		}
		

	}

}
