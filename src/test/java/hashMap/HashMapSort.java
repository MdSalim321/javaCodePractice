package hashMap;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapSort {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "Java");
		map.put(4, "C");
		map.put(3,  "Selenium");
		map.put(2, "Python");
		
		//System.out.println(map);
		
		TreeMap<Integer, String> sortKey = new TreeMap<Integer, String>(map);
		System.out.println(sortKey);
				
		
	
		
		
		
		
		
	}

}
