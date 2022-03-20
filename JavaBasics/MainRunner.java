import java.util.Scanner;
class MainRunner
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter three numbers");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
int small=a;
if(b<small)
small=b;
if(c<small)
small=c;
System.out.println("Smallest among them is  "+small);
}
}