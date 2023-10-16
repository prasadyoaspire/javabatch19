package com.cg;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet courses = new TreeSet(); // sorted collection

		courses.add("java");
		courses.add("c++");
		courses.add("sql");
		courses.add("spring");
		
		courses.add("c++"); //duplicate
		
		System.out.println(courses);

	}

}
