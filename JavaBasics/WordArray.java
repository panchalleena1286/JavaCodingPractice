class WordArray
{
public static void main(String[] args)
{
String arr[] = {"Leena","Rachita","Sharada","Deepa","Akashata","Shruti","Pooja"};
String hw = arr[0];
for(int i=1;i<arr.length;i++)
{
if(hw.length()<arr[i].length())
hw = arr[i];
}
System.out.println("Highest length Word:"+hw);
}
}