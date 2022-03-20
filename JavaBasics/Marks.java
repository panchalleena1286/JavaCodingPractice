import java.util.Scanner;
class Marks
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Physics Marks");
int p = sc.nextInt();
System.out.println("Enter Chemistry Marks");
int c = sc.nextInt();
System.out.println("Enter Maths Marks");
int m = sc.nextInt();
System.out.println("Enter Bio Marks");
int b = sc.nextInt();

 double avg=(p+c+m+b)/4;

if(avg>=85)
{
System.out.println("Distinction");
}
else if(avg>=60&&avg<=84)
{
System.out.println("1st Class");
}
else if(avg>=50&&avg<=59)
{
System.out.println("2nd Class");
}
else if(avg>=35&&avg<=49)
{
System.out.println("Pass");
}
else
{
System.out.println("Fail");
}
}
}