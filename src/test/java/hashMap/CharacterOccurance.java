package hashMap;
import java.util.*;

public class CharacterOccurance {

	public static void main(String[] args) {

		String st = "My name is Selim Shaikh";
		
		String st1 = st.replaceAll(" ", "");
		System.out.println(st1);
		String st2 = st1.toLowerCase();
		System.out.println(st2);
		
		// Store in a Character Array 
		char [] ch = st2.toCharArray();
		System.out.println(ch);
		
		// Display the character array 
		for(char c : ch)		
		{
			System.out.print(c+", ");
		}
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (char chh : st2.toCharArray()) 
		{
			
            map.put(chh, map.getOrDefault(chh, 0) + 1);
            
        }

        System.out.println("\nCharacter Frequency: \n" + map);
		
		
	
	}

}
