import java.util.Scanner;
class EvenOdd
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
switch(num%2)
{
case 0:System.out.println("Number is Even");
	break;
case 1:System.out.println("Number is Odd");
	break;
}
}
}