package com.cg;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList nums = new ArrayList();
		
		nums.add(new Integer(10));
		nums.add(new Integer(50));
		nums.add(20);  // nums.add(new Integer(20));  Autoboxing
		nums.add(70);  //nums.add(new Integer(70));  Autoboxing
		nums.add(new Integer(40));
		
		System.out.println(nums);
	}

}
