package com.cg;

public class SleepDemo {

	public static void main(String[] args) {
		
		System.out.println("Main starts...");
		
		for(int i =1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" :"+i);
			
			try {
				Thread.sleep(5*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Main starts...");
	}
}
