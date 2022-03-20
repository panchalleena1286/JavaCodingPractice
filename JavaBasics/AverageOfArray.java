class AverageOfArray
{
public static void main(String[] args)
{
double arr[] = {1,2,3,4,5,6,7,8,9,11};
int sum = 0;
for(int i=0;i<arr.length;i++)
{
sum = sum+arr[i];
}

double average = sum/arr.length;
System.out.println("average of an Array:"+average);
}
}