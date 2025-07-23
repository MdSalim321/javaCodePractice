package javaArray;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "cba";
		
		// replace extra space & converts to lowercase
		
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();
		
		// Converts string to char array
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		// Sort both arrays
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println(str1+" and "+str2+" both are Anagram");
		}
		else
		{
			System.out.println(str1+" and "+str2+" are not Anagram");

		}
	
	}

}
