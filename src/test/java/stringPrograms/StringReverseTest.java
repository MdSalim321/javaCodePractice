package stringPrograms;

public class StringReverseTest {

	public static void main(String[] args) {
	
		String st = "Admin";
		String rev = "";
		String st1 = st.substring(0,2);
		
		for (int i = st.length()-1; i>1; i--) {
			
			rev = rev + st.charAt(i);
		}	
		String stfinal = st1 + rev;
		System.out.println(stfinal);

	}
}
