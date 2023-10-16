package com;

public class EmployeePersonMain {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1001,50000,"raj",25);
		System.out.println("EmpId: "+emp1.getEmpId());
		System.out.println("Name: "+emp1.getName());
		System.out.println("Age: "+emp1.getAge());
		System.out.println("Salary: "+emp1.getSalary());
		
		Employee emp2 = new Employee(1002,70000,"sam",26);		
		
		Employee emp3 = new Employee(1003,60000,"jhon",24);

	}

}
