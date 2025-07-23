package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorHashMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("A", 80);
		map.put("B", 85);
		map.put("C", 75);
		map.put("D", 60);
		
		System.out.println(map);
		
		Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
		

		while(itr.hasNext())
		{
			Map.Entry<String, Integer> e= itr.next();
			System.out.println("key: "+e.getKey()+" Value: "+e.getValue());
		}
		
	}

}
