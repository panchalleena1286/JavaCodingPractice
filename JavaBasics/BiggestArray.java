import java.util.Scanner;
class BiggestArray
{
static int bigValueArray(int ar[])
{
int big = ar[0];
for (int i=1;i<ar.length;i++)
{
if(ar[i]>big)
big = ar[i];
}
return big;
}

public static void main(String[] args)
{
System.out.println("Enter the size of an Array:");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

int ar[] = new int[n];
System.out.print("Enter "+n+" integers:");
for (int i=0;i<ar.length;i++)
{
ar[i] = sc.nextInt();
}
int s = bigValueArray(ar);
System.out.println("Sum of the Elements of an Array:"+s);
}
}