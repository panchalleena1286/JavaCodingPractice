/*Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class. Derive FirstClass, Ladies, 
General, Luggage classes from the compartment class. Override the notice function in each of them to print notice suitable to the type of the
s1 compartment.
Create a class TestCompartment . Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.*/

abstract class Compartment{
	abstract void notice();
}

class FirstClass extends Compartment{

	@Override
	void notice() {
		// TODO Auto-generated method stub
		System.out.println("First Class");
	}
	
}

class Ladies extends Compartment{
	
	@Override
	void notice() {
		System.out.println("Ladies compartment");
	}
}

class General extends Compartment{

	@Override
	void notice() {
		// TODO Auto-generated method stub
		System.out.println("General Compartment");
	}
	
}

class Luggage extends Compartment{

	@Override
	void notice() {
		// TODO Auto-generated method stub
		System.out.println("Luggage compartment");
	}
	
}
public class RailCoach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment a[] = new Compartment[10];
		
		double i = Math.random()*5;
		
		int x = (int)i;
		
		System.out.println(x);
		
		switch(x) {
		case 1:a[0] = new FirstClass();
		a[0].notice();
		break;
		
		case 2 : a[1] = new Ladies();
		a[1].notice();
		break;
		
		case 3 : a[2] = new General();
		a[2].notice();
		break;
		
		case 4 : a[3] = new Luggage();
		a[3].notice();
		break;
		
		default : System.out.println("Invalid");
		}
	
	}

}
