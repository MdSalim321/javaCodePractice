package arrayList;

import java.util.*;
public class ArrayListSort {

	public static void main(String[] args) {

			ArrayList<Integer> list = new ArrayList<>(Arrays.asList(20, 10, 70, 30, 40));
			
			Collections.sort(list);
			
			for(int n : list)
			{
				System.out.println(n);
			}
			
	
			
		
		
		
	}

}
