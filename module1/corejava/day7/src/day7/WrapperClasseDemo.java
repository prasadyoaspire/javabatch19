package day7;

public class WrapperClasseDemo {

	public static void main(String[] args) {
		
		int i = 10;
		
		Integer k = new Integer(i); // boxing : converting primitive to obj
		
		 //unboxing : get primitive value from obj
		int j = k.intValue();
		
		
		//java 5 onwards, auto boxing and auto unboxing
		
		//auto boxing
		Integer d = 10;  // Integer d = new Integer(10);
		
		//auto unboxing
		int p = d; // int p = d.intValue()
		
		
	}

}
