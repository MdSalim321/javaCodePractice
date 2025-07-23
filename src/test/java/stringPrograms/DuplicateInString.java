package stringPrograms;

public class DuplicateInString {

	public static void main(String[] args) {

		String st = "Big Black Bug Bit a Big dog Black Dog on his Big Black nose";
		
		String st1 = st.toLowerCase();
		System.out.println(st1.toLowerCase());
		
		String word[] = st1.split(" ");
		
		
		for (int i = 0; i < word.length; i++) {
			if (word[i].equals("0")) // Already counted
				continue;
			
			int count = 1;
			
	
			for (int j = i + 1; j < word.length; j++) {
				if (word[i].equals(word[j])) {
					count++;
					word[j] = "0"; // Mark as counted
				}
			}
			
			
			if (count > 1) {
				System.out.println(word[i]);
			}
	}
}
}
