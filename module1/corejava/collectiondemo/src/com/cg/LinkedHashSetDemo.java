package com.cg;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet courses = new LinkedHashSet();  //ordered collection which maintains insertion order
		
		courses.add("java");
		courses.add("c++");
		courses.add("sql");
		courses.add("spring");
		
		courses.add("c++"); //duplicate
		
		System.out.println(courses);

	}

}
