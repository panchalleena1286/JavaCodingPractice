import java.util.Scanner;
class Array2
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int sum = 0;
int size = sc.nextInt();
double x[] = new double[5];
x[0] = 11.23;
x[1] = 82.58;
x[2] = 96.4;
x[3] = 80.45;
x[4] = 96.31;
for (int i=x.length-1;i>=0;i--)
{
  sum = sum+x[i];
}


}
}