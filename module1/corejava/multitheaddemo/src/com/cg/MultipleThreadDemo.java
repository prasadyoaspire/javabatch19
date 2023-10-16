package com.cg;

public class MultipleThreadDemo {

	public static void main(String[] args) {
		
		System.out.println("Main Starts...");
		
		MyClass myClass = new MyClass(); // new state
		myClass.setName("T1");
		myClass.start();	// runnable state
		
		MyClass myClass2 = new MyClass();
		myClass2.setName("T2");
		myClass2.start();	
		
		MyClass myClass3 = new MyClass();
		myClass3.setName("T3");
		myClass3.start();	
				
		System.out.println("Main Ends...");
	}

}
