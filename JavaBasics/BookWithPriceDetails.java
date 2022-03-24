//Write a program to create a class Book with the following-

import java.util.Scanner;
class Book
{
double price;
String title;
String author;
Book(double price,String title,String author)
{
this.price=price;
this.title=title;
this.author=author;
}
void displaydetails()
{
System.out.println("Title of the book:"+title);
System.out.println("Author of the book:"+author);
System.out.println("Original price of the book:"+price);
}
void discountedprice(double x)
{
double fin= (x/100)*price;
price= price-fin;

System.out.println("Discount:"+x+"%");
System.out.println("Price after discount:"+price);
}
}
public class BookWithPriceDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book(800,"Land of Sea","John");
		b.displaydetails();
		b.discountedprice(15);
	}

}
