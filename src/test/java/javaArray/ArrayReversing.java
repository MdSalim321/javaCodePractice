package javaArray;

import org.testng.annotations.Test;

public class ArrayReversing {
	
	@Test
	void copymathod()
	{
	double arr [] = {10, 20, 30, 40.5, 55.5};
	int start = 0; 
	int end = arr.length-1;
	System.out.println(end);	
	
	while (start< end) 
	{
		double temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
		start++;
		end --;
	}
	
	for (double num : arr) 
	{
		System.out.print(num+", ");
	
	}
	}
}
	
	
	
	

