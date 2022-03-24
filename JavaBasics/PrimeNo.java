//Write a Program to find whether a number is prime or not
//To convert a command line argument to integer you have to use int i = integer.parseInt(args[0]).

import java.util.Scanner;
public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String as="20";
		int n=Integer.parseInt(as);
		Scanner sc = new Scanner(System.in);
		if((n==1) ||(n==2))
		{
		System.out.println(n+" is a prime number");
		}
		else
		{
		for(int i=2;i<n;i++)
		{
		if(n%i==0)
		{
		System.out.println(n+" is not a prime number");
		break;
		}
		else
		{
		System.out.println(n+" is a prime number");
		break;
		}
		}
		}
	}

}
