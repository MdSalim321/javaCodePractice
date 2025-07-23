package hashMap;
import java.util.*;

public class DuplicateCharacterFinding {

	public static void main(String[] args) {
		
		
		String st = "They are very good boy";
		
		String st1 = st.replace(" ", "").toLowerCase();
		System.out.println(st1);
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for( char ch: st1.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
		}
		
		System.out.println(map);
		
		// To iterate the hashMap element 
		for(Map.Entry<Character, Integer> entry: map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+" present "+entry.getValue()+" times in the Array");
			}
			
		}
	
	}

}
