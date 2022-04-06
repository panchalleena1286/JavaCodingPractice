package automobile.twowheeler;

import automobile.Vehicle;

public  class Hero extends Vehicle{
	String modelName; 
	String registrationNumber;
	String ownerName;
	public int speed;
	
	
	public Hero(String modelName, String registrationNumber, String ownerName, int speed) {
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
	
	public int speed() {
		return speed;
	}
	
	public void radio() {
		System.out.println("radio device");
	}
	
	
}
