package javaArray;

import org.testng.annotations.Test;

public class ArraySmallest {
	@Test
	void arraySmallest()
	{
		float [] arr = {12,76,100,6,3};
		
		float min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]< min) {
				min = arr[i];	
			}
		}
		System.out.println("Smallest number is: " +min );
	}

}
