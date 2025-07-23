
package hashMap;
import java.util.*;

public class CharacterFrequency {

	public static void main(String[] args) {
		
		String st = "My name is Selim Bhai";
		
		String st1 = st.toLowerCase().replace(" ","");
		
		System.out.println(st1);
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char ch: st1.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		System.out.println(map);
		

	}

}
