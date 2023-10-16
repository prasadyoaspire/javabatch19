package day7;

public class Employee {

	private int empno;
	private String name;
	private double salary;
	private Role role;
	
	public Employee(int empno, String name, double salary, Role role) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.role = role;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
}
