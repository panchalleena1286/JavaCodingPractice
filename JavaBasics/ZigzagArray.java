class ZigzagArray
{
static int[] zigzagArr(int x[],int y[])
{
int z[] = new int[x.length+y.length];
int j=0,k=0;
System.out.print("Array1 is ");
for(int i=0;i<x.length;i++)
System.out.print(x[i]+"  ");
System.out.println();

System.out.print("Array2 is ");

for(int i=0;i<y.length;i++)
System.out.print(y[i]+"  ");
System.out.println();
for (int i=0;i<x.length&&i<y.length;i++)
{
z[j++] = x[i];
z[j++] = y[i];
k++;
}
while(k<x.length)
{
z[j++] = x[k];
k++;
}
while(k<y.length)
{
z[j++] = y[k];
k++;
}
return z;
}

public static void main(String[] args)
{
int x[] = {15,25,35,45,55,76,98,7};
int y[] = {10,20,30,40,50};

int a[] = zigzagArr(x,y);
System.out.print("Zigzag Merged Array is ");

for(int k=0;k<a.length;k++)
System.out.print(a[k]+"  ");

}
}