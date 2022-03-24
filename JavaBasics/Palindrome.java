//write a program to accept a string from the command prompt and display whether the string is a palindrome or not.
//you have to extract each character from the beginning and end of the string and compare it with each other. 
//String x="Malayalam", char c = x.charAt(i) where i is the index .

import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String a =sc.next();
		String b="";
		int s= a.length();
		for(int i=s-1;i>=0;i--)
		{
		b= b+a.charAt(i);
		}
		if(a.equals(b))
		{
		System.out.println(a+" is a palindrome");
		}
		else
		{
			System.out.println(a+" is a not palindrome");
		}
	}

}
