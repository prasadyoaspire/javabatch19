package com.cg;

public class ThreadDemo2 {

	public static void main(String[] args) {
		
		System.out.println("Main starts...");
		
		MyRunnable myRunnable = new MyRunnable();
		Thread t1 = new Thread(myRunnable);		
		t1.setName("R1");
		
		t1.start();		

		for(int j=51;j<=80;j++) {
			System.out.println(Thread.currentThread().getName()+": "+j);
		}
		
		System.out.println("Main ends...");
	}
}
