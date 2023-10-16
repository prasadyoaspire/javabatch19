package com.cg;

public class OddThread extends Thread {
	
	private PrintNumber printNumber;
	
	public OddThread(PrintNumber printNumber) {		
		this.printNumber = printNumber;
	}

	public void run() {			
		printNumber.printOdd();
	}
}
