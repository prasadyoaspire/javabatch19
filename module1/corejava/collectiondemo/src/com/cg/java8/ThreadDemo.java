package com.cg.java8;

public class ThreadDemo {

	public static void main(String[] args) {
		
		System.out.println("Main starts...");
		
		Runnable  r1 = ()-> {
			for(int i=1;i<=30;i++) {
				System.out.println(i);
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		Runnable  r2 = ()-> {
			for(int i=50;i<=80;i++) {
				System.out.println(i);
			}
		};
		
		Thread t2 = new Thread(r2);
		t2.start();
	
		System.out.println("Main ends...");
	}

}
