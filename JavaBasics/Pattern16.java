/*import java.util.Scanner;
class Pattern16
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Digit:");
int n = sc.nextInt();

for(int i=n; i>=1; i--)
{

for(int j=1;j<=i;j++)
{
System.out.print(j+" ");
}
System.out.println();
}
}
}

*/
import java.util.Scanner;
class Pattern16
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Digit:");
int n = sc.nextInt();
int i,j,k;
for(i=1;i<=n;i++)
{
for(j=1;j<=n-i;j++)
{
System.out.print("  ");
}
k=n;
for(j=1;j<2*i;j++)
{
System.out.print(k+" ");
if(j<i)
k--;
else
 k++;
}
System.out.println();
}
}
}

