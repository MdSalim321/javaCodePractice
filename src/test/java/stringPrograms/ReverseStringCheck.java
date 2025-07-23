package stringPrograms;

import java.util.Scanner;

public class ReverseStringCheck {

	public static void main(String[] args) {
		
		String st = "Manam";
				
		String revSt = new StringBuilder(st).reverse().toString();
		
//		if (st == revSt) {
//			System.out.println("palindrome");	
//		}
//		else {
//			System.out.println("Not Palindrome");
//		}
		
		System.out.println(st.equalsIgnoreCase(revSt) ? "Palindrome" : "Not Palindrome");
		
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		
		String stt = sc.nextLine();
		System.out.println("Input String is: "+stt);
		
		String revvstt = new StringBuilder(stt).reverse().toString();
		System.out.println(revvstt);
		System.out.println(stt.equalsIgnoreCase(revvstt) ? "Palindrome" : "Not a palindrome");
		
	}

}
