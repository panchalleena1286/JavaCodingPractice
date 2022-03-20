// Write a Program to accept a number N and print whether it is Positive, Negative or Zero.

import java.util.*;
public class PosNegZero {
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer number: ");
        n = sc.nextInt();

        if(n>0)
        System.out.println(n+" is positive number");

        else if(n<0)
        System.out.println(n+" is Negative Number");

        else 
        System.out.println("Its Zero");
    }
    
}
