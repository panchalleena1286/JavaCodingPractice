// write a Program to accept two numbers and print the Greater Value of the two.

import java.util.Scanner;

public class GreaterValue {
    
    public static void main(String args[])
    {
        int n1 , n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Two Numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if(n1>n2)
         System.out.println(n1+" is greater value");

        else if(n1<n2)
        System.out.println(n2+" is greater value");

        else 
        System.out.println("Both are Equals");
    }
}
