import java.util.Scanner;
class CountArray
{
static int[] countOfArray(int arr[])
{
int evencount = 0, oddcount = 0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]%2==0)
evencount++;
else
oddcount++;
}
int count[] = {evencount, oddcount};
return count;
}

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of an Array:");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("Enter "+n+" integers:");

for(int i=0;i<arr.length;i++)
{
arr[i] = sc.nextInt();
}

int s[] = countOfArray(arr);
System.out.println("Number of Evencount "+s[0]);
System.out.println("Number of oddcount "+s[1]);
}
}