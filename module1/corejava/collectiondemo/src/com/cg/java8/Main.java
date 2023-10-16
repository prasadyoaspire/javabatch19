package com.cg.java8;

public class Main {

	public static void main(String[] args) {
		
		//first approach
		MyInterface myInterface1 = new MyClass();
		
		myInterface1.m1(); //method calling
		
		//second approach
		MyInterface myInterface2 = new MyInterface() {

			@Override
			public void m1() {
				
				System.out.println("m1 implemenation 2");
			}			
		};
		
		myInterface2.m1(); //method calling
		
		//third approach - using lambda expression
		
		MyInterface myInterface3 = () -> System.out.println("m1 implemenatin 3");
		
		myInterface3.m1(); //method calling
		
		
	}

}
