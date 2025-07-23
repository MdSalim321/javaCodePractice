package javaArray;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.annotations.Test;


public class ArrayRemoveDuplicate {
	@Test
	void removeDuplicate()
	{

	int [] arr = {1,2,3,4,4,5,5};
	
	Set<Integer> set = new HashSet<>();
	
	for(int num : arr)
	{
		set.add(num);
	}
	
	for(int numm : set)
	{
		System.out.println(numm);
	}
	}

}
