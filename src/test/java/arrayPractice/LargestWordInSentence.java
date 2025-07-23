package arrayPractice;
import java.util.*;

public class LargestWordInSentence {

	public static void main(String[] args) {
		
		String st = "Prgramming Language is java";
		
		String st1 = st.toLowerCase().replace(" ", "");
		
		System.out.println(st1);
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char ch : st1.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
		}
		System.out.println(map);
		
	}
}
