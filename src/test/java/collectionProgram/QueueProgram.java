package collectionProgram;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueProgram {

	public static void main(String[] args) {
		
		PriorityQueue<String>	 prioq = 	new PriorityQueue<>();
		System.out.println(prioq);
				
		prioq.add("Ram");
		prioq.add("Jadu");
		prioq.add("Karim");
		System.out.println(prioq);
		
		// it access the top element of the queue 
		System.out.println(prioq.peek());
		System.out.println(prioq.element());
		
		// remove the top element of the queue 
		System.out.println(prioq.poll());
		System.out.println(prioq.remove());
		
	}
	
	
}
