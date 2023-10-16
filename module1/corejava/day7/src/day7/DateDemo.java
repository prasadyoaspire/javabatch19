package day7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateDemo {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate after20Days = today.plusDays(20);
		System.out.println("After 20 days date is: "+after20Days);
		
		LocalDateTime today2 = LocalDateTime.now();
		System.out.println(today2);
		
		LocalDate dob = LocalDate.of(2001, 10, 20);
		System.out.println("DOB: "+dob);
		
		LocalDate dob2 = LocalDate.of(2001, Month.OCTOBER, 20);
		System.out.println("DOB2: "+dob2);		
	}
}
