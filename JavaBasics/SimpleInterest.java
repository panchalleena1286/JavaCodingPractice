import java.util.Scanner;
class SimpleInterest
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter the Principal:");
float p = sc.nextFloat();

System.out.println("Enter the rate of Interest:");
float r = sc.nextFloat();

System.out.println("Enter the Time:");
float t = sc.nextFloat();

float si = (p*r*t)/100;
System.out.println("The Simple Interest is: "+si);

}
}