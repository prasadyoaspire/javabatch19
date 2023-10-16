package com.cg;

public class EvenOddNumberDemo {

	public static void main(String[] args) {
		
		//System.out.println("Main starts....");
		
		PrintNumber printNumber = new PrintNumber(); // shared resource
		
		EvenThread evenThread = new EvenThread(printNumber);
		evenThread.setName("Even");
		evenThread.start();
		
		OddThread oddThread = new OddThread(printNumber);
		oddThread.setName("Odd");
		oddThread.start();		
				
		//System.out.println("Main ends...");
	}
}
