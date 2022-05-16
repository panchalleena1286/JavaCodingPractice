package core_java;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		age = Integer.parseInt(args[0]);
		if(age>18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not eligible to vote");
		}
				

	}

}
