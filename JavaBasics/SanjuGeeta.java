import java.util.Scanner;
class SanjuGeeta
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int num = sc.nextInt();

if(num%3==0&&num%5==0)
{
System.out.println("Sanju WEDS Geeta");
}
else if(num%3==0)
{
System.out.println("Sanju");
}
else if(num%5==0)
{
System.out.println("Geeta");
}
else 
{
System.out.println("Breakup");
}

}
}