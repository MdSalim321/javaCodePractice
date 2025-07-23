package stringPrograms;

public class FirstThreeReverseThensame {
	public static void main(String[] args) {
		
		String st = "testing";
		String rev = "";
		
		
		for(int i = 2; i>= 0; i--)
		{
			rev = rev + st.charAt(i);	
		}
		System.out.println("first three charecter reverse is: "+rev);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(rev);
		sb.append(st.substring(3,7));
		
		System.out.println("The desired output is:  "+sb);
}
}
