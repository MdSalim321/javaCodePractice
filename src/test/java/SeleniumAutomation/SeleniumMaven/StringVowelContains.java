package SeleniumAutomation.SeleniumMaven;

import java.util.Scanner;

public class StringVowelContains {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
	
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
			
		System.out.println(st.toLowerCase().matches(".*[aeiou].*"));
		
	}

}
