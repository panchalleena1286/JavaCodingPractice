package Test;

import Music.Playable;
import Music.String.Veena;
import Music.wind.Saxophone;

public class Live {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veena v = new Veena();
		Saxophone s = new Saxophone();
		Playable p = new Veena();
		Playable p1 = new Saxophone();
		
		v.play();
		System.out.println();
		s.play();
		System.out.println();
		p.play();
		System.out.println();
		p1.play();
		
	}

}
