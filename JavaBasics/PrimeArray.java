import java.util.Scanner;
class PrimeArray
{
static int countPrime(int arr[])
{
int count = arr.length;

for(int i=0;i<arr.length;i++)
{
int x = arr[i];
for(int j=2;j<=x/2;j++)
{
if(x%j == 0)
{
count--;
break;
}
}
}
return count;
}

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter size of an array:");
int size = sc.nextInt();
int arr[] = new int
[size];
System.out.print( "enter "+size+" integers:" );

for(int i=0;i<arr.length;i++)
{
arr[i] = sc.nextInt();
}
int a = countPrime(arr);
System.out.println(a);
}
}