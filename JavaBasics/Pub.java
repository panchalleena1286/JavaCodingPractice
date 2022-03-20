import java.util.Scanner;
class Pub
{
public static void main(String args[])
{
int age;
Scanner s = new Scanner(System.in);
System.out.println("Enter Your Age");
age = s.nextInt();
if(age<18)
{
System.out.println("Not Eligible to pub");
}
else if(age>=18&&age<=75)
{
System.out.println("Eligible to pub");
}
else if(age>75&&age<=100)
{
System.out.println("Better Luck Next time");
}
else
{
System.out.println("..........");
}
}
}