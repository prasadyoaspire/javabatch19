package com.cg;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main Starts...");
		
		MyClass myClass = new MyClass();
		myClass.setName("T1");
		myClass.start();
		
		
		myClass.join(); //main thread pauses its execution and resumes after thread T1 completion
		
		
		for(int i= 51;i<80;i++) {
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
		
		System.out.println("Main Ends...");
	}
}
