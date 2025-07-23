package stringPrograms;

public class StringReading {

	public static void main(String[] args) {
		System.out.println("enter a string");
		
		String st = "SElim";
		System.out.println(st);
		int size = st.length();
		System.out.println(size);
		char c;
		
		StringBuilder resultSt = new StringBuilder();
		
		
		// code replace the vowel of a string
		for (int i = 0; i < size; i++) {
			c= st.charAt(i);
			
			if ("AEIOUaeiou".indexOf(c) != -1) {
				resultSt.append('1');	
			}
			else {
				resultSt.append(c);
			}
		}
		
		System.out.println(resultSt+"\n");	
		
		// convert the string into uopper case & lower case
		String stUp = st.toUpperCase();
		System.out.println(stUp);
		String stlo = st.toLowerCase();
		System.out.println(stlo);
		System.out.println(stUp + " , "+ stlo);

	}

}
