package collectionProgram;

import java.util.HashSet;

public class HashSetPractice {

	public static void main(String[] args) {
		
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("fruit");
		set.add("Mango");
		set.add("Lichi");
		
		
		System.out.println(set);
		
		HashSet<Integer> num = new HashSet<Integer>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		System.out.println(num.contains(3));
		
		System.out.println(num);
	//	set.addAll(num);
		System.out.println(set);
		
		for(int n:num)
		{
			System.out.println(n);
		}
	
		
	}

}
