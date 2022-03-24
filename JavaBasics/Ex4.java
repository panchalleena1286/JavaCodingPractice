//Write a Program to Reverse the Number?
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the digits");
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 
		 int rev = 0;
		 while(n!=0) {
			 int r = n%10;
			 rev = rev*10+r;
			 n=n/10;
		 }
		 System.out.println("Reversed Digits:" +rev);

	}

}
