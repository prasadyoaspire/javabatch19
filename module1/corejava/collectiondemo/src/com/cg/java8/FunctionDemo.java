package com.cg.java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<String,Integer> myFun = s -> s.length();		
		int len = myFun.apply("Hello World");		
		System.out.println(len);
		
		BiFunction<Integer,Integer,Integer> biFun = (a,b) -> a+b;
		int sum = biFun.apply(200, 300);
		System.out.println("Sum:"+sum);
		

	}

}
