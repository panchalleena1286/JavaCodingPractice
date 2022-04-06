package automobile;

import automobile.twowheeler.Hero;
import automobile.twowheeler.Honda;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h = new Hero("hero1","4643546","Leena",20);
		System.out.println(h.modelName());
		System.out.println(h.registrationNumber());
		System.out.println(h.ownerName());
		System.out.println(h.speed());
		h.radio();
		System.out.println();
		
		Honda h1 = new Honda("Honda1" ,"6212595" , "Leena" ,30);
		System.out.println(h1.modelName());
		System.out.println(h1.registrationNumber());
		System.out.println(h1.ownerName());
		System.out.println(h1.speed());
		h1.cdplayer();
		
		
	}

}
