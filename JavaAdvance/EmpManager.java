/*Write a program to create an Employee class with the following attributes:
Empno, ename, address, contactNo.
Inherit the class Employee to Manager class with the following attributes:
Dept,Number-of-reportees
Create 5 employees and 2 managers. Display all the details of employees and managers.*/

class Employee{
	
	static int Empno;
	static String ename;
	static String address;
	static long contactno;
	
	public Employee(int Empno,String ename,String address,long contactno){
		super();
		this.Empno = Empno;
		this.ename= ename;
		this.address= address;
		this.contactno=contactno;
		
	}
	
	void display() {
		System.out.println("Employee number of employee: "+Empno);
		System.out.println("Name of the Employee: "+ename);
		System.out.println("Address of the Employee: "+address);
		System.out.println("Contact number of the Employee: "+contactno);
		System.out.println();
	}
	
}

 class Manager extends Employee{
	
	String Dept;
	int NoOfReprt;
	
	public Manager( String Dept, int NoOfReprt) {
		super(Empno, ename , address, contactno);
		
		this.Dept = Dept;
		this.NoOfReprt = NoOfReprt;
	}
	
	void display1() {
		System.out.println("Department of Manager: "+Dept);
		System.out.println("Number of Reports: "+NoOfReprt);
	}
	
		
}
	


public class EmpManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Employee E1 = new Employee (1,"Emp1","abc123",1234567890);
		Employee E2 = new Employee (2, "gug", "jiguih",879794877);
		Employee E3 = new Employee (3, " uguf", "hgjgk",499899899);
		Employee E4 = new Employee (4, "guigk", "hfyuhv", 531656646);
		Employee E5 = new Employee (5, "ytuuuy", "fytjbj", 565665466);
		E1.display();
		E2.display();
		E3.display();
		E4.display();
		E5.display();
		
		Manager m1 = new Manager( "Sales", 44545);
		Manager m2 = new Manager("Developer", 49955);
		m1.display1();
		m2.display1();
		m1.display();
		
		
		
		
		
		
	}

}
