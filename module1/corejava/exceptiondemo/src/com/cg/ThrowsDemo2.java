package com.cg;

public class ThrowsDemo2 {

	public static void main(String[] args)  {		
		System.out.println("Main starts...");		
		String s = "";
		
		try {
			 sayHello(s);
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}		
		System.out.println("Main ends...");
	}
		
	static void sayHello(String str) throws ClassNotFoundException {
		
		if(str.length()==0) {
			
			//ArithmeticException ex = new ArithmeticException();
			ClassNotFoundException ex = new ClassNotFoundException();
			throw ex;
		}
		System.out.println("hello: "+str);		
	}
}
