package com.cg;

public class NumberGenerator {

	int counter = 1;

	synchronized public void generateOdd() throws InterruptedException {
		while (counter <= 50) {
			if (counter % 2 == 0) {
				wait();
			}
			System.out.println(Thread.currentThread().getName() + ": " + counter);
			counter++;
			notify();
		}
	}

	synchronized public void generateEven() throws InterruptedException {
		while (counter <= 50) {
			if (counter % 2 == 1) {
				wait();
			}
			System.out.println(Thread.currentThread().getName() + ": " + counter);
			counter++;
			notify();
		}
	}
}
