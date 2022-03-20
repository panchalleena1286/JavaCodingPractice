class SortedArray
{
static int[] merge(int a[], int b[])
{
int i=0,j=0,k=0;
int c[] = new int[a.length+b.length];
while(i<a.length&&j<b.length)
{
if(a[i]<b[j])
c[k++] = a[i++];
else
c[k++] = b[j++];
}

while(i<a.length)
{
c[k++] = a[i++];
}

while(j<b.length)
{
c[k++] = b[j++];
}
return c;
}

public static void main(String[] args)
{
int a[] = {2,5,8};
int b[] = {1,6,7,11};

int v[] = merge(a,b);

System.out.print("Sorted Merged Array is ");

for(int k=0;k<c.length;k++)
System.out.print(v[k]+"  ");
}
}