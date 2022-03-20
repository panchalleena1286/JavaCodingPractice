import java.util.Scanner;
class MainRunner1
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two Numbers");
a=sc.nextInt();
b=sc.nextInt();

int small=a;
if(b<small)
small=b;
System.out.println("Smallest among them is  "+small);
}
}