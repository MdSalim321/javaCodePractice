package hashMap;

import java.util.*;
public class DuplicateWordInSentence {

	public static void main(String[] args) {

		String st = " This is java and java is good language";
		String [] words = st.split(" ");
		
		System.out.println(words.length);
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String wd : words)
		{
			map.put(wd, map.getOrDefault(wd, 0)+1);
		}
		System.out.println(map);
		
		for(Map.Entry<String, Integer> e : map.entrySet())
		{
			if(e.getValue()> 1)
			{
				System.out.println(e.getKey()+" present: "+e.getValue()+" times");
			}
			
		}
		
		
		
	}

}
