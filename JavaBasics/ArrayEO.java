class ArrayEO
{
static int[] eoArray(int ar[])
{
int br[] = new int[ar.length];
int i=0, j=ar.length-1, k1=0, k2=ar.length-1;

System.out.println("User input Array:");
for( i=0;i<ar.length;i++)
System.out.print(ar[i]+" ");

while(k1<=k2)
{
if(ar[i]%2==0)
br[k1++] = ar[i];

if(ar[j]%2==1)
br[k2--] = ar[j];

i++;
j--;
}
return br;
}

public static void main(String[] args)
{
int ar[] = {8,3,5,7,8,6,9};

int a[] = eoArray(ar);
System.out.println("Resulted Array is:");

for (int i = 0;i<ar.length;i++)
System.out.print(a[i]+" ");
}
}