package stringPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("enter a string");
	Scanner sc = new Scanner(System.in);
	String st = sc.nextLine();
	
	System.out.println(st);
	String rev = "";
	
	for (char ch : st.toCharArray())  
	{
		rev = ch + rev;
	}
	System.out.println("Reverse string is: "+rev);
		
		
	}

}
