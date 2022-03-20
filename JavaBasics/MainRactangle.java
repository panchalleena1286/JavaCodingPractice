import java.util.Scanner;
class MainRactangle
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Length and Bredth:");
double len = sc.nextDouble();
double brd = sc.nextDouble();
double ar = len*brd;
double per = 2*(len+brd);
System.out.println("Area of Ractangle is: "+ar);
System.out.println("Perimeter of Ractangle is: "+per);
}
}