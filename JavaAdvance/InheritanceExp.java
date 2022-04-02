/*Write a program to create a class Company with the following attributes:
CompId, name, HO, CEO
Inherit the class Company to BranchOffices with the following details:
BrId, location,dept
Create 5 branches of the company and display the details.*/

class Company{
	int CompID = 2525;
	String name = "WIPRO";
	String HO = "BANGALORE";
	String CEO = "THIERRY DELAPORTE";
	
	Company(){
		
	}
}

class BranchOffice extends Company{
	
	int BrID;
	String loc;
	String dept;
	
	BranchOffice(int BrID,String loc, String dept ) {
		// TODO Auto-generated constructor stub
		this.BrID =  BrID;
		this.loc = loc;
		this.dept = dept;
	}


void display() {
	System.out.println("Company id: "+CompID);
	System.out.println("Company name: "+name);
	System.out.println("Company Head Office: "+HO);
	System.out.println("Company CEO: "+CEO);
	System.out.println("Company Branch Office ID: "+BrID);
	System.out.println("Branch Office Location: "+loc);
	System.out.println("Branch Office Department: "+dept);
	System.out.println();
}
}

public class InheritanceExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BranchOffice B1 = new BranchOffice(01, "CHENNAI" , "WIPRO LIMITED");
		BranchOffice B2 = new BranchOffice(02, "PUNE" , "WIPRO INFOTECH");
		BranchOffice B3 = new BranchOffice(03, "HYDERABAD" , "WIPRO ENTERPRISE");
		BranchOffice B4 = new BranchOffice(04, "DELHI" , "WIPRO LIGHTINING");
		BranchOffice B5 = new BranchOffice(05, "MUMBAI" , "WIPRO DIGITAL");
		B1.display();
		B2.display();
		B3.display();
		B4.display();
		B5.display();
		
		
		
	}

}
