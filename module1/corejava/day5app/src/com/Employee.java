package com;

public class Employee extends Person {

	private int empId;
	private double salary;
	
	public Employee(int empId,double salary,String name, int age) {
		super(name,age);
		this.empId = empId;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
