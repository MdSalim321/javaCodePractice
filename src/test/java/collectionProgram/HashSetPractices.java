package collectionProgram;
import java.util.HashSet;

public class HashSetPractices {

	public static void main(String[] args) {
		
		HashSet num1 = new HashSet();
		num1.add(1);
		num1.add(2);
		num1.add(3);
		
		System.out.println(num1);
		HashSet num2 = new HashSet();
		num2.add(3);
		num2.add(4);
		num2.add(5);
		System.out.println(num2);
		
		num1.addAll(num2);
		
		System.out.println(num1);
		
		num1.retainAll(num2);
		System.out.println(num1);
		num1.removeAll(num2);
		System.out.println(num1);
		
		
		

		
		
		
	}

}
