package stringPrograms;

import java.util.Scanner;

public class StringJava {

	public static void main(String[] args) {
	
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int count = 0;
		
		System.out.println("The input string is: "+st);
		
		StringBuilder sb = new StringBuilder();
		
		
		for (int i = 0; i < st.length(); i++) {
			if (String.valueOf(st.charAt(i)).toLowerCase().matches("[aeiou]")) {
				count ++;
				sb.append(st.charAt(i));
			}
	}
		System.out.println("Total vowel count is: " +count);
		System.out.println("Vowel present in the input string is: "+sb);
	}
}
