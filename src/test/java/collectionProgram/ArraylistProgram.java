package collectionProgram;

import java.util.ArrayList;
import java.util.List;

public class ArraylistProgram {

	public static void main(String[] args) {
		

		
	//ArrayList<String>	stuName  = new ArrayList<>();
		
		List stuName = new ArrayList<>();
	
	stuName.add("Bhai");
	
	stuName.add(0, "First Position");
	
	//System.out.println(stuName);
	
	System.out.println(stuName.get(1));
	stuName.set(1, "Mango");
	System.out.println(stuName);
	stuName.remove(0);
	System.out.println(stuName);

	System.out.println(stuName.isEmpty());
	
	stuName.clear();
	System.out.println(stuName);

	}

}
