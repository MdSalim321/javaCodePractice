package collectionProgram;


import java.util.ArrayList;
import java.util.List;
public class ArrayListPractice {

	public static void main(String[] args) {

		
		ArrayList<String> list = new ArrayList<String>();
		
			list.add("Mango");
			list.add("Lichi");
			list.add("Fruit");
			list.addFirst("First");
			list.addLast("Last");
			list.add(1, "AddSpecific");
			list.set(1, "UpdateHere");
			list.remove(1);
			System.out.println(list.contains("Lichii"));
			
			
			for(String ft: list)
			{
				System.out.println(ft);
				
			}

	}

}
