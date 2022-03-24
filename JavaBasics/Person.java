
public class Person {
	String name;
	int age;
	
	void setName(String n)
	{
		name = n;
		
	}
	
	void setAge(int a)
	{
		age = a;
	}
	
	void Birthday()
	{
		age++;
		System.out.println(name+" is now "+age);
	}
}
