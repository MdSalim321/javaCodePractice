package stringPrograms;

import java.util.HashSet;

public class VowelCountInString {

	public static void main(String[] args) {
		
		String st = "TeettstingAllee";
		String st1 = st.toLowerCase();
		System.out.println(st1);
		char c;
		int count = 0;
		HashSet<Character> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < st1.length(); i++) 
		{
			c = st1.charAt(i);
			
			if(set.add(c))
			{
				sb.append(c);
			}
			if("aeiou".indexOf(c)!= -1)
			{
				count ++;
				
			}
		}
		System.out.println(count);
		System.out.println(set);
		System.out.println(sb);
		
	}

}
