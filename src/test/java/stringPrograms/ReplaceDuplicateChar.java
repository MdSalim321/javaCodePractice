package stringPrograms;

import java.util.LinkedHashSet;

public class ReplaceDuplicateChar {

	public static void main(String[] args) {
	
		String st = "Pprogrammingg";
		
		String stlow = st.toLowerCase();
		
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();

		
		for (char c : stlow.toCharArray()) {
			
			set.add(c);	
		}
		System.out.println(set);
		
		StringBuilder sb = new StringBuilder();
		
		for (char c : set) {
			sb.append(c);
			
		}
		
	String	fiSt = sb.toString();
	System.out.println(fiSt);

	}

} 
