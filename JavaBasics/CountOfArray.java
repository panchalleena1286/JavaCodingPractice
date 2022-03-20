class CountOfArray
{
public static void main(String[] args)
{
double arr[] = {1,2,3,4,5,6,7,8,9,11};
int evencount = 0;
int oddcount = 0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]%2==0)
evencount++;
else
oddcount++;

}

System.out.println("Even number of element in Array:"+evencount);
System.out.println("Odd number of element in Array:"+oddcount);
}
}