import java.util.Scanner;
class BigValueArray
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of an Array:");
int n=sc.nextInt();
int ar[]=new int[n];

System.out.println("Enter the "+n+" integers:");
for(int i=0;i<ar.length;i++)
{
ar[i]=sc.nextInt();
}
int big = ar[0];
for(int i=1;i<ar.length;i++)
{
if (ar[i]>big)
big=ar[i];
}
System.out.println("Biggest value of an Array:"+big);
}
}