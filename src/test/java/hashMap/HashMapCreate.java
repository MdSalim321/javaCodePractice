package hashMap;
import java.util.*;

public class HashMapCreate {

	public static void main(String[] args) {

			HashMap<Integer, String> map = new HashMap<>();
			
			map.put(1, "Java");
			map.put(2,  "Python");
			map.put(3, "Selenium");
			
			System.out.println(map);
			System.out.println(map.get(2));
			
			System.out.println(map.getOrDefault(1, "Java"));
			
			for(Map.Entry<Integer, String> entry: map.entrySet())
			{
				System.out.println("Key is: "+entry.getKey()+", Value is: "+entry.getValue());
			}	
			
			System.out.println(map.containsKey(3));
			System.out.println(map.containsValue("Selenium"));
			System.out.println(map.containsKey(4));
			
			map.remove(2);
			System.out.println(map);
			
			
			
		
		
	}

}
