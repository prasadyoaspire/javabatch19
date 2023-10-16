package day7;

public class TypeCastingDemo {

	public static void main(String[] args) {

		// integer types
		byte b = 10;
		int i = b; // implicit casting => int i = (int) b;

		int k = 20;
		byte j = (byte) k; // explicit casting

		double d = 10;
		int l = (int) d;

		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte) (b1 + b2);
		
		//type casting with object references	
		
		X x1 = new Y();
		x1.m1();
		
		Y y1 = (Y)x1;
		y1.m2();

	}
}

class X {
	void m1() {
		System.out.println("m1 inside X");
	}
}

class Y extends X {
	void m2() {
		System.out.println("m1 inside Y");
	}
}
