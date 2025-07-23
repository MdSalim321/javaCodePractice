package stringPrograms;

import java.util.Scanner;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		System.out.println("The input string is: "+st);
		int count = 0;
		
		System.out.println("enter a charecter to be searched in the input string: ");
		char ch = sc.next().charAt(0);
		
		
		for (int i = 0; i < st.length(); i++) {
			
			if (st.charAt(i) == ch) {
				System.out.println(ch+ " present at the index number of input string is: "+i);
				count ++;
			}
		}
		System.out.println(ch+" present in the given string "+count+ " times");
	}
}

