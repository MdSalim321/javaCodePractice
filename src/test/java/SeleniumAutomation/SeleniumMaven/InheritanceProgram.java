package SeleniumAutomation.SeleniumMaven;


class Animal {
    void eat(int a, int b) {
        System.out.println("Animal eats");
        System.out.println("summation is: "+(a+b));
    }
    void display()
    {
    	
    	System.out.println("display parent");
    }
}



class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
    
    void display()
    {
    	super.display();
    	System.out.println("Display child");
    }
}

public class InheritanceProgram {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.eat(10, 20);   // Inherited from Animal
        d.bark();  // Own method
        d.display();
    }
}
