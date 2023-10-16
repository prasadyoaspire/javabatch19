package com.cg;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList courses = new LinkedList();	
		
		courses.add("java");
		courses.add("c++");
		courses.add("sql");
		courses.add("spring");
		courses.addFirst("html");
		courses.addLast("css");
		courses.add(3, "js");
		courses.add("c++");
		
		System.out.println(courses);

	}

}
