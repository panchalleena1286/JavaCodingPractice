import java.util.Scanner;
class Feet
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the number:");
float in = s.nextFloat();
float feet =  in/12;
System.out.println("Inches into Feet:"+feet);
}
}