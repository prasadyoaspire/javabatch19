package day7;

public class CmdLineArgsDemo {

	public static void main(String[] args) {
		
		int c = Integer.parseInt(args[0])+Integer.parseInt(args[1]);
		
		System.out.println("Sum: "+c);

	}

}
