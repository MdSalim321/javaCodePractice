package stringPrograms;

public class ReverseStringTesting {

	public static void main(String[] args) {
	
		String st = "Admin";
		String rev = "";
		String st1 = st.substring(0,2);
		
		for (int i = st.length()-1; i>1; i--) {
			
			rev = rev + st.charAt(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(st1);
		sb.append(rev);
		System.out.println(sb);
		
	}
}
