package day7;

public interface I1 {

	void m1();
	
	void m2();
	
	//java8, onwards
	
	default void m3() {
		System.out.println("default m3 method inside interface");
	}
	
	static void m4() {
		System.out.println("static m4 method inside interface");
	}
}
