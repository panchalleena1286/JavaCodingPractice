class Animal{
	public void eat() {
		System.out.println("Eating");
	}
	
	public void sleep() {
		System.out.println("Sleeping");
	}
}



class Bird extends Animal{
	@Override
	public void eat() {
		super.eat();
		System.out.println(" Override Eating");
	}
	
	@Override
	public void sleep() {
		super.sleep();
		System.out.println(" Override Sleeping");
	}
	
	public void fly() {
		System.out.println("Flying method");
	}
}



public class InheritanceAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		Bird b = new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();
	}

}
