package hashMap;

import java.util.*;


public class ArrayToArrayList {

	public static void main(String[] args) {

		int [] arr = {10, 40, 50, 20};
		
		
		
		List<Integer> list = new ArrayList<>();
		
		for(int num: arr)
		{
			list.add(num);
		}
		System.out.println(list);
		
	
		
	}

}
