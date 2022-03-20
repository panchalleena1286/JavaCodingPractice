import java.util.Scanner;
class Num2
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Any Number:");
int n = sc.nextInt();
while(n>=1)
{
System.out.print(n+" ");
n--;
}
}
}