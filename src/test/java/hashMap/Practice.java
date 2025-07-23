package hashMap;

import java.util.Arrays;
import java.util.HashSet;

public class Practice {

	public static void main(String[] args) {

		int [] arr = {10, 40,90, 60, 80, 90};
		
		for(int n: arr)
		{
			System.out.print(n+", ");
		}
		
		Arrays.sort(arr);
		
		System.out.println();
		for(int n: arr)
		{
			System.out.print(n+", ");
		}
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int n : arr)
		{
			set.add(n);
		}
		
		System.out.println("\n"+set);
	
	}

}
