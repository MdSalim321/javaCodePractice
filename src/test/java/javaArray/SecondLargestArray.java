package javaArray;

import org.testng.annotations.Test;

public class SecondLargestArray {
	
	@Test
	void secondLargest()
	{
		int arr [] = {10, 11, 12, 13, 14, 15};
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		System.out.println(first);
		System.out.println(second);
		
		  for (int num : arr) {
	            if (num > first) {
	                second = first;
	                first = num;
	            } 
	            else if (num > second && num != first) {
	                second = num;
	            }
	        }
		  System.out.println(second);
		 

	}

}
