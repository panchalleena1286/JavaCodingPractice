//String wipro Bangalore as command line argument and print the output "wipro Technologies Bangalore".
//If the command line is "ABC Mumbai" , then it should print "ABC Technologies Mumbai".

import java.util.Scanner;
public class AssQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		String v = sc.next();
		String c= "Technologies";
		System.out.print(s+" "+c+" "+v);
	}

}
