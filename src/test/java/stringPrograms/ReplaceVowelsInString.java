package stringPrograms;
import java.util.Scanner;

public class ReplaceVowelsInString {

	public static void main(String[] args) {
		
		System.out.println("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int size = st.length();
		System.out.println("The input String is: "+st);
		StringBuilder sb = new StringBuilder();
		
		String result = st.replace(" ", "");
		System.out.println(result);
	
	
	}

}
