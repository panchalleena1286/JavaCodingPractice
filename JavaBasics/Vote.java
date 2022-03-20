import java.util.Scanner;
class Vote
{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
System.out.println("What is Your Name? ");
String Name = sc.next();

System.out.println(Name+" How Old are you?");
int Age = sc.nextInt();
if(Age>=18)
System.out.println(Name+" you can vote");
else 
System.out.println(Name+" you are not eligible to vote");

}
}