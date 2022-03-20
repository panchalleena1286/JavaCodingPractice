import java.util.Scanner;
class PrimeNo1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number1:");
int m=sc.nextInt();
System.out.println("Enter the Number2:");
int n=sc.nextInt();
while(m<=n)
{
int count=1;
for(int i=1;i<=m/2;i++)
{
if(m%i==0)
count++;
}
if(count==2)
System.out.print(m+" ");
m++;
}

}
}