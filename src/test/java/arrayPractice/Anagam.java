package arrayPractice;

import java.util.Arrays;

public class Anagam {

	public static void main(String[] args) {
		
		String st1 = "abc";
		String st2 = "cbad";
		
		st1.replaceAll(" ", "");
		st2.replaceAll(" ", "");
		
		char[] arr1 = st1.toCharArray();
		System.out.println(arr1);
		
		char [] arr2 = st2.toCharArray();
		System.out.println(arr2);
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Anagam");
		}
		else {
			System.out.println("Not Anagam");
		}
		
		
		
		

		
		
	}

}
