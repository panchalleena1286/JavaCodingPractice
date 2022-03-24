//Write a Program to print Multiplication Table?

import java.util.Scanner;
/**
 * @author dell
 *
 */
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(n+ "*" + i + "=" + n*i);
		}
	}

}
