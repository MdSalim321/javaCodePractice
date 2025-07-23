package hashMap;
import java.util.*;
public class SortByValue {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Math", 80);
		map.put("Chemistry", 90);
		map.put("Physics", 85);
		map.put("Bios", 92);
		
		List<Map.Entry<String , Integer>> list  = new ArrayList<>(map.entrySet());
		
		list.sort(Map.Entry.comparingByValue());
		
		for(Map.Entry<String, Integer> e: list)
		{
			System.out.println("Sorted key is: "+e.getKey()+", corresponding value is: "+e.getValue());
			
		}	
	}

}
