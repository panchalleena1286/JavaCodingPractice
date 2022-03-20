import java.util.Scanner;
class Pattern13
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Digit:");
int n = sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j>=1;j--)
{
System.out.print(j+" ");
}
System.out.println();
}
}
}