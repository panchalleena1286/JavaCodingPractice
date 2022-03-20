import java.util.Scanner;
class AvgArray
{
static int avgArray(int arr[])
{
int sum =0;
for(int i=0;i<arr.length;i++)
{
sum = sum+arr[i];
}
int avg = sum/arr.length;
return avg;
}

public static void main(String[] args)
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
int a = avgArray(arr);
System.out.println("Average of an Array: "+a);
}
}