/*Create a class named Movie that can be used with your video rental business. The Movie class should track the Motion Picture 
Association of 
America (MPAA) rating (e.g., Rated G, PG-13, R), ID Number, and movie title with appropriate accessor and mutator methods. 
Also create an equals() 
method that overrides Object’s equals() method, where two movies are equal if their ID number is identical. Next, create three 
additional classes named Action, Comedy, and Drama that are derived from Movie. Each of these movies will have a method named 
calcLateFees that takes as input the number of days a movie is late and returns the late fee for that movie. 
The default late fee is $2/day. Action movies have a late fee of $3/day, comedies are $2.50/day, and dramas are $2/day. 
Test your classes from a main method.*/
import java.util.Scanner;
class Movie{
	String rating;
	int id;
	String title;
	
	Movie(String rating, int id , String title){
		
		setID(id);
		setTitle(title);
		setRating(rating);
	}
	
	//mutators(setters)methods
	void setID(int i)
	{
		id = i;
	}
	void setTitle(String t)
	{
		title = t;
	}
	void setRating(String r)
	{
		rating = r;
	}
	
	//accessor(Getters)method
	int getID()
	{
		return id;
	}
	String getTitle()
	{
		return title;
	}
	String getRating()
	{
		return rating;
	}
	
	double calLateFees(int nDays)
	{
		return 2.0*nDays;
	}
	
	public boolean equals(Object a)
	{
		Movie m = (Movie)a;
		
		return m.id==id;
	}
}

  class Action extends Movie{
	Action(String title, int id, String rating){
		super(title, id ,rating);
	}
	
	double calLateFees(int nDays)
	{
		return 3.0*nDays;
	}
}

 class Comedy extends Movie{
	 Comedy(String title, int id, String rating){
		super(title, id ,rating);
	}
	
	double calLateFees(int nDays) {
		return 2.5*nDays;
	}
}

 class Drama extends Movie{
	Drama(String title, int id, String rating){
		super(title,id,rating);
	}
	
	double calLateFees(int nDays) {
		return 2.0*nDays;
	}
}

public class VideoRental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie e1 = new Movie("E1",1,"M");
		Movie e2 = new Movie("E2",2,"M-1");
		Movie e3 = new Movie("E3",3,"M-2");
		Movie e4 = new Movie("E4",4,"M-3");
		
		System.out.println(e1.getID()+" "+e1.getTitle()+" "+e1.getRating()+" "+e1.calLateFees(1));
		System.out.println(e2.getID()+" "+e2.getTitle()+" "+e2.getRating()+" "+e2.calLateFees(2));
		System.out.println(e3.getID()+" "+e3.getTitle()+" "+e3.getRating()+" "+e3.calLateFees(3));
		System.out.println(e4.getID()+" "+e4.getTitle()+" "+e4.getRating()+" "+e4.calLateFees(4));
	}

}
