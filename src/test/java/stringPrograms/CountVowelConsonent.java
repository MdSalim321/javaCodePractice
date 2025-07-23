package stringPrograms;

import java.util.Scanner;

public class CountVowelConsonent {

	public static void main(String[] args) {
		
		System.out.println("enter a  string: ");
		
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int size = st.length();
		String stlow =	st.toLowerCase();
		System.out.println(size);
		int voCount = 0, consCount = 0;
		char c;
		for (int i = 0; i < size; i++) {
			
			if ("aeiou".indexOf(stlow.charAt(i)) != -1) {
				voCount ++;
			}
			else {
				consCount ++;
			}
		}
		System.out.println("Vowel count is: "+voCount +" Consonent count is: "+consCount);
	}
}
