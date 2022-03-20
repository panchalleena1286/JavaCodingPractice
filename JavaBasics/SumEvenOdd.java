import java.util.Scanner;
class SumEvenOdd
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter The Number:");
int n = sc.nextInt();
int evensum = 0;
int oddsum = 0;

for(int i=1;i<=n;i++)
{
if(i%2==0)
	evensum += i;
else
	oddsum += i;
}
System.out.println("even sum: "+evensum);
System.out.println("odd sum: "+oddsum);

}
}