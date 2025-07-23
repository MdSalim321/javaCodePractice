package collectionProgram;

import java.util.HashSet;
import java.util.*;

public class SetProgras {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Mango");
		set.add("Lichu");
		set.add("Cherry");
		set.add("Cucumber");
	
		System.out.println(set);
		for (String st : set) {
			System.out.println(st);
		}
	
		set.remove("Mango");
		System.out.println(set);
		System.out.println(set.contains("Lichu"));	
		
		HashSet<String> num = new HashSet<>();
		num.add("1");
		num.add("2");
		num.add("3");
		set.addAll(num);
		System.out.println("Union is: "+set);

	}

}
