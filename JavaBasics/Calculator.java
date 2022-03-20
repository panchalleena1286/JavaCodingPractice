import java.util.Scanner;
class Calculator
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the First Number:");
float a = s.nextFloat();
System.out.println("Enter the Second Numbere:");
float b = s.nextFloat();

float add = a+b;
float sub = a-b;
float mul = a*b;
float div = a/b;

System.out.println("Addition of two Numbers is: "+add);
System.out.println("Substraction of two Numbers is: "+sub);
System.out.println("Multiplication of two Numbers is: "+mul);
System.out.println("Division of two Numbers is: "+div);

}
}