package com.cg;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet courses = new HashSet();  //unordered and unsorted
		
		courses.add("java");
		courses.add("c++");
		courses.add("sql");
		courses.add("spring");
		
		courses.add("c++"); //duplicate
		
		System.out.println(courses);
		
		

	}

}
