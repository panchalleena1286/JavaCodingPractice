import java.util.Scanner;
class MainArray2
{
static int[] readArray()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of an Array:");
int n = sc.nextInt();
int ar[] = new int[n];
System.out.println("Enter "+n+" integers:");

for(int i=0;i<ar.length;i++)
{
ar[i] = sc.nextInt();
}
return ar;
}

static void dispArray(int []ar)
{
for(int i=0;i<ar.length;i++)
{
System.out.println(ar[i]+" ");
}
System.out.println();
}

static int SumOfArray(int ar[])
{
int sum = 0;
for(int i=0;i<ar.length;i++)
{
sum = sum+ar[i];
}
return sum;
}

public static void main(String[] args)
{
int x[] = readArray();
System.out.println("User Entered Array:");

dispArray(x);

int s = SumOfArray(x);
System.out.println("Sum of Array Elements:"+s);
}
}