package com;

public class ToStringMethodDemo {

	public static void main(String[] args) {
		
		A a1 = new A(10);
		 System.out.println(a1); // => System.out.println(a1.toString());
		 
		 B b1 = new B();
		 System.out.println(b1); // => System.out.println(b1.toString());
		 
		 String s = new String("abc");
		 System.out.println(s); // System.out.println(s.toString());   
	}
}

class A extends Object {
	int i;
	A(int i) {
		this.i = i;
	}	
	void m1() {
		
	}	
	@Override
	public String toString() {
		return ""+i;
	}
}

class B {  //extends Object
	
	@Override
	public String toString() {
		return "class b obj tostring";
	}
}
