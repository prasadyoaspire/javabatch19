package day7;

public class DefaultInterfaceMethodDemo {

	public static void main(String[] args) {
		I1 i = new M1();
		i.m1();
		i.m2();
		i.m3(); //default method
		I1.m4(); //static method		
	}

}
