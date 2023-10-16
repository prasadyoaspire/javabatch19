package com;

public class EqualsDemo {

	public static void main(String[] args) {
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		if(s1.equals(s2)) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
		X x1 = new X(20);
		X x2 = new X(20);
		
		if(x1.equals(x2)) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
	}
}

class X {
	int i;
	X(int i) {
		this.i = i;
	}
	
}
