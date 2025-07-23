package collectionProgram;

import java.util.LinkedList;
import java.util.*;

public class LinkedListProgram {

	public static void main(String[] args) {
	
		LinkedList<String> fruits 	=new LinkedList<>();
		
		System.out.println(fruits);
		
		fruits.add("Apple");
		System.out.println(fruits);
		fruits.addFirst("Banana");
		System.out.println(fruits);
		fruits.addLast("Flower");
		fruits.addLast("Bhaijan");
	
		
		
		System.out.println(fruits);
		fruits.add(1, "Cherry");
		System.out.println(fruits);
		System.out.println(fruits.get(2));
		
		fruits.remove();
		System.out.println(fruits);
		fruits.removeLast();
		System.out.println(fruits);
		fruits.set(0, "Dog");
		System.out.println(fruits);
		System.out.println(fruits.contains("Cat"));
		System.out.println(fruits.size());
		
		
		
		
		
		

	}

}
