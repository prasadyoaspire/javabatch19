package com.cg;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		
		ArrayList<Double> prices = new ArrayList<>();
		prices.add(20.3);
		prices.add(3.05);
		
		ArrayList<String> courses = new ArrayList<>();
		courses.add("java");
		courses.add("c++");
		courses.add("sql");
		courses.add("spring");
		courses.add("c++"); //duplicate
				
//		courses.add(10);
//		courses.add(10.2);
		
		System.out.println(courses);
		
		//how to traverse 
		
		Iterator<String> i = courses.iterator();
		while(i.hasNext()) {				
			String st = i.next();
			System.out.println(st);
		}

	}

}
