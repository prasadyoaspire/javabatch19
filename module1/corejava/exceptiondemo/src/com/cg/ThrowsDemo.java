package com.cg;

public class ThrowsDemo {

	public static void main(String[] args) {
		
		System.out.println("Main starts....");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		int a = 10;
		int b = 0;
		
		try {
			div(a,b);
		}
		catch(ArithmeticException e) {
			System.out.println("denominator should not be zero");
			System.out.println(e);
			String msg = e.getMessage();
			System.out.println(msg);
			e.printStackTrace();
			
		}	
		
		System.out.println("Main ends....");
	}
	
	//This methods throws ArithmeticException (unchecked exception)
	// no need to declare it. Its optional
	static void  div(int a, int b) throws ArithmeticException{
		int c = a/b;
		System.out.println("Result: "+c);
	}

}
