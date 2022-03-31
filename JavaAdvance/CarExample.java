/*Create a class Car which contains members speed, noOfGear. The class has a method drive() which is responsible to provide starting
speed and noOfGears to a Car.  Implement display() method which will display all attributes of Car class.
The class SportCar is derived from the class Car which adds new features AirBallonType. When this method is invoked, initial 
speed and gear status must be displayed on console.  Override the display method which display all attribute of the SportCar. 
Make use of super class display() method.*/
class Car{
	static String speed ;
	static int noOfgear;
	
	Car(String speed , int noOfgear){
		this.speed = speed;
		this.noOfgear = noOfgear;
	}
	
	void drive(){
		speed = "30km/hr";
		noOfgear = 2;
		System.out.println(" Staring Speed of the car: "+speed);
		System.out.println("Number of Gear: "+noOfgear);
		 
	}
	
	 void display() {
		System.out.println(" Staring Speed of the car: "+speed);
		System.out.println("Number of Gear: "+noOfgear);
		
	}
}

class SportCar extends Car{
	String AirBallonType;
	 
	SportCar(String speed, int noOfgear, String AirBallonType){
		super(speed, noOfgear);
		
		this.AirBallonType = AirBallonType;
	}
	@Override
	void display() {
		System.out.println("Speed of the car: "+speed);
		System.out.println("Number of Gear: "+noOfgear);
		System.out.println("Air Ballon Type: "+AirBallonType);
	}
	
}
public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car SportCar = new SportCar("23km/hr", 5, "dfhiehfei");
		SportCar.display();
		Car c = new Car("5km/hr", 1);
		c.drive();
		
	}

	
}
