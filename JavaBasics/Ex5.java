import java.util.Scanner;

//import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int rev=0;
		int temp = n;
		
		while(n!=0) {
			int r = n%10;
			rev = rev*10+r;
			n= n/10;
			
		}
		if(rev==temp)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");

	}

}
