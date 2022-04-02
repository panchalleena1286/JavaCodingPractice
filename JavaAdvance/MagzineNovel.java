/*Write a program to create a class Book with the following data members: isbn, title and price. Inherit the class Book to two 
derived classes : 
Magazine and Novel with the following data members:
Magazine:
   type
Novel :
   author
Populate the details using constructors. Create a magazine and Novel and display the details.*/

class Book{
	int isbn = 6565;
	String title = "Data Structure";
	int price = 300;
	
	Book(){
		System.out.println("Isbn= "+isbn+" \ntitle= "+title+" \nprice "+price);
		System.out.println();
	}
}

class Magazine extends Book{
	String type = "Computer Science";
	
	Magazine(){
		System.out.println("Type= "+type);
	}
}

class Novel extends Book{
	String author = "John R Habbart";
	
	Novel(){
		System.out.println("Author= "+author);
	}
}
public class MagzineNovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Magazine m = new Magazine();
		Novel n = new Novel();
	}

}
