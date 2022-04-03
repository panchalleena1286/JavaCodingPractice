//Write a program to create a class Vehicle with the following
 //- attributes :
 //   Name, brand, price, mileage
// - methods :
//    i. constructor to initialize the vehicles
//   ii. display function to display the details of the vehicles
  //iii. return only the price of the vehicle
 //- task :
//Create 2 vehicles, enter the details. Display the vehicle with lowest price and display the vehicle with best mileage.

import java.util.Scanner;
class Vehicle{
	String RegNo;
	String Brand;
	int price;
	int  mileage;
	
	 Vehicle(String RegNo, String Brand, int price, int  mileage){
		this.RegNo=RegNo;
		this.Brand=Brand;
		this.price=price;
		this.mileage=mileage;
	}
	
	void displayDetails() {
		System.out.println("Registration Number of  Vehicle: "+RegNo);
		System.out.println("Vehicle's Brand: "+Brand);
		//System.out.println("Price of the vehicle: "+price);
		System.out.println("mileage of the vehicle: "+mileage);
		System.out.println();
		
	}
	
	
}
public class VehicleAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v = new Vehicle("hr100541","Renault Kwid", 300000, 20 );
		Vehicle v1 = new Vehicle("rt46523"," Honda Amaze", 1100000, 25);
		v.displayDetails();
		v1.displayDetails();
		
		if(v.price<v1.price) {
			System.out.println("Vehicle with lowest price "+v.price);
		}
		else {
			System.out.println("Vehicle with lowest price "+v1.price);
		}
		
		if(v.mileage>v1.mileage) {
			System.out.println("Vehicle with best mileage "+v.mileage);
		}
		else {
			System.out.println("Vehicle with best mileage "+v1.mileage);
		}

	}

}
