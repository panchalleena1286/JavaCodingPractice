class Employee{
	int id;
	String name;
	int salary;
	void setId(int no) {
		id = no;
	}
	void setNames(String n) {
		name = n;
	}
	void serSalary(int s) {
		salary = s;
	}
	void getEmployeeDetails() {
		System.out.println(name+" salary is "+ salary);
	}
}

public class EmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.setId(101);
		emp1.setNames("John");
		emp1.serSalary(12000);
		emp1.getEmployeeDetails();

	}

}
