package com.cg;

public class CheckExceptionDemo {
	
	void test() throws ClassNotFoundException {
		
		//code
		
//		NullPointerException ex = new NullPointerException();
//		throw ex;
		
	    ClassNotFoundException ex1 = new ClassNotFoundException();
		throw ex1;
		
	}

	public static void main(String[] args) {
		

	}

}
