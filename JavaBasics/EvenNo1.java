import java.util.Scanner;
class EvenNo1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Any Number:");
int n = sc.nextInt();

for(int i=2;i<=n;i=i+2)
{
System.out.print(i+" ");
}

}
}