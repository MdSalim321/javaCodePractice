package stringPrograms;

public class ReplacedVowelInString {

	public static void main(String[] args) {
	
		String st = "ProgrammingsoiuUIO";
		char c;
		
		StringBuilder result = new StringBuilder();
	
		for (int i = 0; i < st.length(); i++) {
			c=st.charAt(i);
		
			if ("AEIOUaeiou".indexOf(c) != -1) {
				result.append('1');	
			}
			else {
				result.append(c);
			}
		}
		System.out.println(result);
		

	}

}
