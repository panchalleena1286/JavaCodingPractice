import java.util.Scanner;
class MainSquare
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the Number:");
double a = s.nextDouble();
double ar = a*a;
double per = 4*a;

System.out.println("Area of Square is: "+ar);
System.out.println("Perimeter of Square is: "+per);

}
}