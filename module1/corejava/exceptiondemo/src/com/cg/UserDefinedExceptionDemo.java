package com.cg;

public class UserDefinedExceptionDemo {

	public static void main(String[] args) {		
		System.out.println("Main starts....");		
		int age = 10;		
		try {
			vote(age);
		}
		catch(AgeLimitException e) {
			System.out.println("Not Eligible for vote");
			System.out.println(e);
			System.out.println(e.getMessage());
		}		
		System.out.println("Main ends....");
	}
	
	static void vote(int age) throws AgeLimitException {		
		if(age<18) {
			//AgeLimitException ex = new AgeLimitException();
			AgeLimitException ex = new AgeLimitException("fdfdfdfdfd dfdfdfdf");
			throw ex;
		}
		System.out.println("Eligible for Vote!");
	}

}
