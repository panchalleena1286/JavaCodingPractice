//Write a program to sort a numeric array element in ascending order .

import java.util.Scanner;
import java.util.Arrays;
public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<=n-1;i++)
		{
		a[i]= sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
