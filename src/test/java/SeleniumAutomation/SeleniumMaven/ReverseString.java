package SeleniumAutomation.SeleniumMaven;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Enter a string: ");
		
		Scanner sc = new Scanner(System.in);
		String OriginalString = sc.nextLine();
		
		System.out.println("Input String is "+OriginalString);
		
		String ReverseStraing = "";
		
		for(int i= (OriginalString.length()-1);i>= 0; i--)
		{
			ReverseStraing +=OriginalString.charAt(i);	
			
		}
		System.out.println("Reverse string is: "+ReverseStraing);
		
	}
}

