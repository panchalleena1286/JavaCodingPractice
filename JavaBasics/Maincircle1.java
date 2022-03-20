import java.util.Scanner;
class Maincircle
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter The Radius");
double r = sc.nextDouble();
double ar = 3.143*r*r;
double cir = 2*3.143*r;
System.out.println("Radius is: "+r);
System.out.println("Area is: "+ar);
System.out.println("Circumference is: "+cir);
}
}