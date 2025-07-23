package stringPrograms;

import java.util.Scanner;

public class PartialReverseString {

	public static void main(String[] args) {

		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int l = st.length();
		
		String rev= "";
		
		for(int i=l-1; i> 1; i--)
		{
			rev = rev + st.charAt(i);
		}
		System.out.println(rev);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(st.substring(0, 3));
		sb.append(rev);
		System.out.println(sb);
	}
}
