package com.cg;

public class EvenThread extends Thread {
	
	private PrintNumber printNumber;
	
	public EvenThread(PrintNumber printNumber) {		
		this.printNumber = printNumber;
	}
	
	public void run() {				
		printNumber.printEven();
	}
}
