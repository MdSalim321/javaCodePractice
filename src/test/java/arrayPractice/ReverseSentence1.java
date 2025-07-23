package arrayPractice;

public class ReverseSentence1 {

	public static void main(String[] args) {

		String st = "Java is a good programming language";
		
		StringBuilder sb = new StringBuilder(st);
		
		String revst = sb.reverse().toString();
		System.out.println(revst);
		
		
		        String sentence = "Java is fun";
		        
		        StringBuilder sbb = new StringBuilder(sentence);
		        String reversed = sbb.reverse().toString();

		        System.out.println("Original Sentence: " + sentence);
		        System.out.println("Reversed Sentence: " + reversed);
		    }
		}

		
	


