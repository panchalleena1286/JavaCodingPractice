import java.util.Scanner;
class DayNo
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter The Number");
int d = sc.nextInt();
if(d>=1&&d<=7)
{
System.out.println("Day number is valid");
}
else
{
System.out.println("Invalid Number");
}
}
}