package day7;

public class EnumDemo {

	public static void main(String[] args) {

		// String monthName = "Mar";

		Months monthName = Months.APR;

		Employee emp1 = new Employee(1001, "raj", 50000, Role.DEVELOPER);

		Employee emp2 = new Employee(1002, "sam", 60000, Role.MANAGER);
		
		System.out.println("Emp1 details");
		System.out.println("Id: "+emp1.getEmpno());
		System.out.println("Name: "+emp1.getName());
		System.out.println("Salary: "+emp1.getSalary());
		System.out.println("Role: "+emp1.getRole());

	}

}
