package hashMap;
import java.util.*;
public class IteratorInHashSet {

	public static void main(String[] args) {
		
		 System.out.println("Iterator in HashSet");
	        HashSet<String> set = new HashSet<>();
	        set.add("Apple");
	        set.add("banana");
	        set.add("Cherry");
	        System.out.println(set);
	        
	        Iterator<String> itr = set.iterator();
	        
	        while(itr.hasNext())
	        {
	            String ft   = itr.next(); 
	            System.out.println(ft);
	        }
	
	}

}
