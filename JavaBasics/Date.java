import java.util.Scanner;
class Date
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter any Date");
int dd = sc.nextInt();
int mm = sc.nextInt();
int yy = sc.nextInt();

if(dd>=01&&dd<=31&&mm>=01&&mm<=12&&yy>00)
{
System.out.println(dd+"/"+mm+"/"+yy+ "is valid Date");
}
else
{
System.out.println("Invalid Date");
}
}
}