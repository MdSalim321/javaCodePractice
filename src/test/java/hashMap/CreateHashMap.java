package hashMap;
import java.util.*;
public class CreateHashMap {

	public static void main(String[] args) {
		
		System.out.println(" Creating a HashMap: ");
		
		HashMap<Integer, String> map = new HashMap<> ();
		
		map.put(1, "Apple");
		map.put(2,  "Banana");
		map.put(3,  "Cherrry");
		
		
		// Print all HashMap element
		System.out.println("HashMap is : "+map);
		
		System.out.println("\n");
		
		// Iterate over a HashMap 
		for(Map.Entry<Integer, String> entry: map.entrySet())
		{
			System.out.println("Key="+entry.getKey()+", Value = "+entry.getValue());
			
			
		}
		
		// Search elemenrt in the HashMap 
		
		System.out.println("Contains value 'Apple' "+map.containsValue("Apple"));
		System.out.println("Contains Key 1 "+map.containsKey(1));
		
		// Remove a element
		map.remove(3);
		System.out.println("Updated map is: "+map);
		
		// Print a value by Key 
		System.out.println("Search a vlaue by Key: "+map.get(2));
		
		// To Check that map is empty or not 
		System.out.println("Is this map empty "+ map.isEmpty());
		
		// To replace a value 
		map.replace(2, "Bindas");
		
		System.out.println("Updated map is: "+map);
			
		
	}

}
