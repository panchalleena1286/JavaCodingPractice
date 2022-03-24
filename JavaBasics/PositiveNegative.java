//Write a program to find input is positive or negative.

import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		if(a>0)
		{
		System.out.println(a+" is a positive number");
		}
		else
		{
		System.out.println(a+" is a negative number");
		}
	}

}
