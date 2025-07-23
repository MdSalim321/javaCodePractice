package javaArray;
import java.util.HashSet;

public class RemoveDuplicateCharecterInString {

	public static void main(String[] args) {
		
		String st = "Programmingg";
		String stt = st.toLowerCase();
		System.out.println(stt);

		HashSet<Character> set = new HashSet<Character>();
		
		for (char c : stt.toCharArray()) {
			set.add(c);
		}
		System.out.println(set);
	}
}

