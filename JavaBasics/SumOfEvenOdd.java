
// Write a Program to accept two numbers and print 

import java.util.*;
public class SumOfEvenOdd {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter the Two Numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        sum = num1+num2;
        System.out.println(num1+" + " +num2+" = "+sum);
        if(sum%2==0)
        System.out.println(sum+" is Even");

        else 
        System.out.println(sum+" is Odd");

    }
}
