package collectionProgram;

import java.util.HashSet;

public class HashSetProgram {

	public static void main(String[] args) {
	
		HashSet<Integer> num = new HashSet<Integer>();
	
		num.add(1);
		num.add(2);
		num.add(3);
		
		HashSet<Integer> num1 = new HashSet<Integer>();
	
		num1.add(2);
		num1.add(3);
		num1.add(4);
		// intersection between two set 
		num.retainAll(num1);	
		
		// adding or union of two set 
		num.addAll(num1);
		
		// set1 substract the set2
		num.removeAll(num1);
		System.out.println(num);
		
	}
}
