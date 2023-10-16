package com.cg;

public class OddNumberThread extends Thread {

	
	private NumberGenerator numberGenerator;
	
	public OddNumberThread(NumberGenerator numberGenerator) {
		this.numberGenerator = numberGenerator;
	}
	
	public void run() {
		try {
			numberGenerator.generateOdd();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
}
