/*There is an animal class which has the common characteristics of all animals. Dog, Horse, Cat are animals(sub-class). Each can shout, 
but each shout is different. Use polymorphism to create objects of same and using an animal variable, make each of the animals shout.*/

class Animal{
	void sound() {
		System.out.println("Animal is making different sound");
	}
}

class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("Bark");
	}
}

class Horse extends Animal{
	@Override
	void sound() {
		System.out.println("Neigh");
	}
}

class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("Meow");
	}
}


public class AnimalExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj = new Dog();
		Animal Horse = new Horse();
		Animal Cat = new Cat();
		Cat.sound();
		obj.sound();
		Horse.sound();
		}

}
