package stringPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DuplicateString {

	public static void main(String[] args) {

		String st = "Programmingg nammee";
		HashSet<Character> set = new LinkedHashSet();
		
		StringBuilder sb = new StringBuilder();
		
		for(char c : st.toCharArray())
		{
			if(set.add(c))
			{
				sb.append(c);
			}
		}
		System.out.println("final string is: "+sb);
	}
}
