import java.util.Random;

/*Create an abstract class Instrument which is having the abstract function play. 
Create three more sub classes from Instrument which is Piano, Flute, Guitar.
Override the play method inside all three classes printing a message 
“Piano is playing  tan tan tan tan  ”  for Piano class
“Flute is playing  toot toot toot toot”  for Flute class
“Guitar is playing  tin  tin  tin ”  for Guitar class 
You must not allow the user to declare an object of Instrument class.
Create an array of 10 Instruments.
Assign different type of instrument to Instrument reference.
Check for the polymorphic behavior of  play method.
Use the instance of operator to print that which object stored at which index of instrument array.*/

abstract class Instrument{
	abstract void play();
	
}

class Piano extends Instrument{
	

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Piano is playing tin tin tin");
		System.out.println();
	}
}

class Flute extends Instrument{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Flute is playing toot toot toot");
		System.out.println();
	}
	
}

class Guitar extends Instrument {

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Guitar is playing tin tin tin");
		System.out.println();
	}
	
}


public class InstrumentPaly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument[] s = new Instrument[10];
		
		Random r = new Random();
		
		for(int i = 0; i<10; i++) {
			int randomNum = r.nextInt((3-1)+1)+1;
			
			if(randomNum == 1)
				s[i] = new Piano();
			
			else if(randomNum == 2)
				s[i] = new Flute();
			
			else if (randomNum == 3)
				s[i] = new Guitar();
				
		}
		
		//Checking polymorphic behaviour
		
		for(int i = 0; i<10 ;i++)
		{
			if(s[i] instanceof Piano) 
				System.out.println("instrument "+i+" is type of piano, ");
			
				
			if(s[i] instanceof Flute) 
					System.out.println("instrument "+i+" is type of Flute, ");
					
			if(s[i] instanceof Guitar) 
				System.out.println("instrument "+i+" is type of Guitar, ");
				
				s[i].play();
			
			
		}
		
		
	}

}
