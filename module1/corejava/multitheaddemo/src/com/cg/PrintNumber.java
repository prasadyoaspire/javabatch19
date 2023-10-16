package com.cg;

public class PrintNumber {
	
	synchronized public void printEven() {		
		int n = 50;		
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(Thread.currentThread().getName()+": "+i);
			}
		}		
	}	
	
	synchronized public void printOdd() {		
		int n = 50;		
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.println(Thread.currentThread().getName()+": "+i);
			}
		}		
	}	
}
