//Write a program to print factorial of n(using do while loop).

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int fi= 1;
		int i=a;
		do{
		fi=fi*i;
		i--;
		}while(i>0);
		System.out.println(fi);
	}

}
