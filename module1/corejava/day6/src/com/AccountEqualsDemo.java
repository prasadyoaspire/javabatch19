package com;

public class AccountEqualsDemo {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1001,"sam",55000);
		System.out.println(acc1);
		
		Account acc2 = new Account(1001,"sam",50000);
		System.out.println(acc2);
		
		if(acc1.equals(acc2) ) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
	}
}
