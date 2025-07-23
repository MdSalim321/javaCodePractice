package collectionProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>(List.of("Java", "Python", "JavaScript"));
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		
	}

}
