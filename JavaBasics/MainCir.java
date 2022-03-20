import java.util.Scanner;
class MainCir
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Radius:");
double r = sc.nextDouble();
double ar = 3.143*r*r;
double cir = 2*3.143*r;

System.out.println("Area of Circle is: "+ar);
System.out.println("Circumference of Circle is: "+cir);
}
}