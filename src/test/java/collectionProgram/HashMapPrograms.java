package collectionProgram;

import java.util.HashMap;

public class HashMapPrograms {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		
		System.out.println(map.get(1));
		System.out.println(map.containsKey(3));	
		System.out.println("HashMap is: "+map);
		
		
	}
}
