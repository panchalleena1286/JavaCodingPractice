import java.util.Scanner;
class PrimeNo
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number:");
int count=1;
int n = sc.nextInt();
for(int i=1;i<=n/2;i++)
{
if(n%i==0)
count++;
}
if(count==2)
System.out.println(n+" is a Prime Number");
else
System.out.println(n+" is not a Prime Number");

}
}