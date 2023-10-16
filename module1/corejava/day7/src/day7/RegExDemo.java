package day7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		
		String input1 = "ssd";
		
//		Pattern pattern = Pattern.compile("..s");
//		Matcher m = pattern.matcher(input);
//		boolean b  = m.matches();
		
		boolean b = Pattern.matches("..s", input1);		
		System.out.println(b);
		
		String input2 = "a";
		boolean b2 = Pattern.matches("[abc]", input2);
		System.out.println(b2);
		
		String input3 = "he90";
		boolean b3 = Pattern.matches("[a-zA-Z0-9]+", input3);
		System.out.println(b3);
		
		String mobile = "6000005021";
		//boolean isValidMobile = Pattern.matches("[987]{1}[0-9]{9}", mobile);
		boolean isValidMobile = Pattern.matches("[987]{1}\\d{9}", mobile);
		System.out.println("isValidMobile: "+isValidMobile);
		
		String inputPwd = "hello9@*";
		boolean ispwdValid = Pattern.matches("[a-zA-Z0-9_@#]{5,10}", inputPwd);
		System.out.println("ispwdValid: "+ispwdValid);
				
		

	}

}
