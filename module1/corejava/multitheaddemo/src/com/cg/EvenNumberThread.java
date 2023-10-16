package com.cg;

public class EvenNumberThread extends Thread {
	
	private NumberGenerator numberGenerator;
	
	public EvenNumberThread(NumberGenerator numberGenerator) {
		this.numberGenerator = numberGenerator;
	}
	
	public void run() {
		try {
			numberGenerator.generateEven();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
}
