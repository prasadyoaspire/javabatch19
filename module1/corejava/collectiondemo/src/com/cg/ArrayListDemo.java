package com.cg;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList courses = new ArrayList();
		courses.add("java");
		courses.add("c++");
		courses.add("sql");
		courses.add("spring");
		courses.add("c++"); //duplicate
		
		System.out.println("size: "+courses.size());
		System.out.println(courses);
		
		
		courses.add(2, "html");		
		System.out.println("size: "+courses.size());
		System.out.println(courses);

	}

}
