class SmallArray
{
public static void main(String[] args)
{
float arr[] = {5.4f,6.2f,7.78f,32.4f,42.7f,2.5f,8.0f,9.8f};
float smallno=arr[0];

for(int i=1;i<arr.length;i++)
{
if(arr[i]<smallno)

arr[i]=smallno;

}
System.out.println("Smallest number of an Array:"+smallno);
}
}