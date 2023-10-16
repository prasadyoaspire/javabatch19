package com;

public class B extends A {

	B() {
		super(10);
		System.out.println("B class zero args constructor");
	}
	B(int k) {
		super();
		System.out.println("B class int args constructor");
	}
}
