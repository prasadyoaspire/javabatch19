package com.cg;

public class MyClass extends Thread {

	@Override
	public void run() {
		for(int i=1;i<=30;i++) {
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
	}
}
