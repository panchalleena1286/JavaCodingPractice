import java.util.Scanner;
class Digit
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Inter Any Number");
int num = sc.nextInt();
if(num>=-99||num<=-10&&num<=99||num>=10)
{
System.out.println("Valid Two Digit Number");
}

else
{
System.out.println("Inter Valid two digit number");
}
}
}