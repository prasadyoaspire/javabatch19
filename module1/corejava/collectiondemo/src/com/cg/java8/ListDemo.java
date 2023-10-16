package com.cg.java8;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
	
		List<String> courses = new ArrayList<>();
		courses.add("java");
		courses.add("sql");
		courses.add("c++");
		courses.add("html");
		courses.add("css");
		
		//courses.forEach(c ->System.out.println(c));
		
		courses.stream().forEach(c ->System.out.println(c));
		
		
		

	}

}
