package javaArray;

class Animal {
	
	 void sound()
	 {
		 System.out.println("Animal makes sound");
	 }

}

class Dog extends Animal
{
	@Override
	void sound()
	{
		super.sound();
		System.out.println("Dog barks");
	}

}
class Cat extends Animal
{
	
	void sound()
	{
		super.sound();
		System.out.println("Cat's sound is like Meuw");
	}
	
}


public class MethodOverriding 
{
	public static void main(String args[])
	{
		Animal d = new Dog();
		d.sound();
		Cat c = new Cat();
		c.sound();
		
	}
}

