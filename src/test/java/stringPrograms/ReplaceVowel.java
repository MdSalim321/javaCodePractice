package stringPrograms;

public class ReplaceVowel {

	public static void main(String[] args) {
		String st = "ProgrammingeeeAAA";
		StringBuilder result = new StringBuilder();
		
		
		
		for (char ch  : st.toCharArray()) {
			if ("AEIOUaeiou".indexOf(ch) != -1) {
				result.append('1');
			}
			else {
				result.append(ch);
			}
		}
		System.out.println(result);
	}

}
