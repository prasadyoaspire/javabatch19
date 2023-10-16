package com.cg;

public class WithExceptionHandling {

	public static void main(String[] args) {

		System.out.println("Main starts...");

		int a = 30;
		int b = 0;

		try {			
			//if any exception occur, jre creates the exception object and throwing
			//1. ArithmeticException ae = new ArithmeticException();
			//2. throw ae;
			
			int c = a / b;
			System.out.println("Result: " + c);
		} catch (ArithmeticException e) {
			System.out.println("denominator should not be zero");
		}

		System.out.println("Main ends....");
	}
}
