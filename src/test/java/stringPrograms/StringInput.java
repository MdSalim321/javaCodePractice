package stringPrograms;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		
		System.out.println("enter a string");

	Scanner sc = new Scanner(System.in);
	String st = sc.nextLine();
	
	System.out.println(st);
	String rev = "";
		
		for (int i= st.length()-1; i>= 0; i--)
		{
			rev += st.toCharArray()[i];
		}
		System.out.println("reverse is: "+rev);

	}

}
