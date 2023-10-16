package day7;

public class InstanceOfOperatorDemo {

	public static void main(String[] args) {
		
		String s1 = new String("abc");		
		StringBuffer sb = new StringBuffer();
		
		if(s1 instanceof String) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		X x1 = new X();		
		System.out.println(x1 instanceof Y);
	}
}


  
