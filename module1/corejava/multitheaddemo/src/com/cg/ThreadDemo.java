package com.cg;

public class ThreadDemo {

	public static void main(String[] args) {
		
		System.out.println("Main starts...");
		
		MyClass myClass = new MyClass();
		myClass.setName("T1");
		
		myClass.start();	// indirectly calls run method by OS level native thread	

		for(int j=51;j<=80;j++) {
			System.out.println(Thread.currentThread().getName()+": "+j);
		}
		
		System.out.println("Main ends...");
	}
}
