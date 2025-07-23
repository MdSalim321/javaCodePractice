package stringPrograms;

import org.apache.commons.lang3.text.StrBuilder;

public class ReversingString {

	public static void main(String[] args) {

		String st = "abcbA";
//		String rev	=new StringBuilder(st).reverse().toString();
//		System.out.println("Revrse string is: "+rev);\
		
		
		String rev ="";
		for(int i =st.length()-1; i>= 0; i--)
		{
			rev = rev+ st.charAt(i);
		}
		
	
		if(rev.equalsIgnoreCase(st))
		{
			System.out.println(st+": is a palindrome");
		}
		else
		{
			System.out.println(st+": is not a palindrome");
		}
	
	}

}
