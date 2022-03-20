import java.util.Scanner;
class NaturalNo1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n, i=1, sum=0;
System.out.println("Enter Any Number:");
 n = sc.nextInt();

while(i<=n)
{
sum = sum+i;
i=i+1;
}
System.out.println(sum);

}
}