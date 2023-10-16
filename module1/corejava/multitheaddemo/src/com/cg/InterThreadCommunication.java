package com.cg;

public class InterThreadCommunication {

	public static void main(String[] args) {
		
		NumberGenerator numberGenerator = new NumberGenerator();
		
		EvenNumberThread t1 = new EvenNumberThread(numberGenerator);
		t1.setName("E");		
		t1.start();
		
		OddNumberThread t2 = new OddNumberThread(numberGenerator);
		t2.setName("O");		
		t2.start();
	}
}
