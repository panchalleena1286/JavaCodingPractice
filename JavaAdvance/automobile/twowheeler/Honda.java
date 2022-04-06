package automobile.twowheeler;

import automobile.Vehicle;

public class Honda extends Vehicle{
	String modelName; 
	String registrationNumber;
	String ownerName;
	public int speed;
	
	
	
	public Honda(String modelName, String registrationNumber, String ownerName, int speed) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String modelName() {
		// TODO Auto-generated method stub
		return modelName;
	}
	@Override
	public String registrationNumber() {
		// TODO Auto-generated method stub
		return registrationNumber;
	}
	@Override
	public String ownerName() {
		// TODO Auto-generated method stub
		return ownerName;
	}
	
	public void cdplayer() {
		System.out.println("cd player");
	}


	public int speed() {
		// TODO Auto-generated method stub
		return speed;
	}
}
