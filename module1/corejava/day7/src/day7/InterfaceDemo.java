package day7;

public class InterfaceDemo {

	public static void main(String[] args) {
		
		//MyClass mc = new MyClass();
		MyInterface mc = new MyClass();
		mc.m1();
		mc.m2();
		System.out.println(MyInterface.PI);

	}

}
