package com.cg.java8;

import java.util.function.Predicate;

public class PedicateDemo {

	public static void main(String[] args) {
		
		int age = 10;
		
//		Predicate<Integer> predicate2 = i -> {
//			boolean result = i > 18;
//			return result;
//		};
		
		Predicate<Integer> predicate = i -> i>=18;	
		
		boolean isEligible = predicate.test(age);
		
		System.out.println("IsEligible: "+isEligible);
		

		
	}

}
