package com.cg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchDemo {

	public static void main(String[] args) {
		
		System.out.println("Main starts...");
		Scanner sc = new Scanner(System.in);
		
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int c = a / b;
			System.out.println("Result: " + c);
		} catch (ArithmeticException e) {
			System.out.println("denominator should not be zero");
		}
		catch (InputMismatchException e) {
			System.out.println(e);
		}
		

		System.out.println("Main ends....");

	}

}
