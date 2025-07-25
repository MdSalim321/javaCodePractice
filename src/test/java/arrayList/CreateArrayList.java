package arrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
public class CreateArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		
		list.add("Java");
		list.add("Python");
		list.add("Selenium");
		list.add(1, "C++");
		
		list.remove(0);
		list.remove("Python");
		list.set(1, "C language");
		
		System.out.println(list);
		
		// Elememt print in list 
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30));
		System.out.println(list1);
		
		// Element print in for loop 
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println("Element is: "+list.get(i));
		}
		
		// Element print using iterator 
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println("Print using iterator"+it.next());	
			
		}
		
		System.out.println(list.contains("C languages"));
		
		
		
		
	}

}
