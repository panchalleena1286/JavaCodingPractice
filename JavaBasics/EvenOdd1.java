
// Write a Program  to accept a number N and print whether the number is Even or Odd.

import java.util.Scanner;

public class EvenOdd1 {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");

        int n = sc.nextInt();

        if(n%2==0)
        System.out.println(n+" is Even");

        else 
        System.out.println(n+" is Odd");
    }
}
