package com.cg.java8;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class StreamArrayDemo {

	public static void main(String[] args) {
		
		int[] nums = {10,20,35,40,53};
		
		System.out.println("Array:");
		Arrays.stream(nums).forEach(n->System.out.println(n));
		
		System.out.println("Even numbers");
		Arrays.stream(nums).filter(n->n%2==0).forEach(n->System.out.println(n));
		
		System.out.println("Sum of All elements:");
		OptionalInt optionalObj = Arrays.stream(nums).reduce((a,b)->a+b);
		if(optionalObj.isPresent()) {
			int sum = optionalObj.getAsInt();
			System.out.println("Sum:"+sum);
		}

	}

}
