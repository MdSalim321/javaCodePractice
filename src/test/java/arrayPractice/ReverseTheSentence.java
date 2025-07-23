package arrayPractice;

public class ReverseTheSentence {

	public static void main(String[] args) {
		
		String st = "Java is a good programming language";
		
		String [] words = st.split(" ");
		
		int size = words.length;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = size-1; i>= 0; i--)
		{
			sb.append(words[i]+ " ");
		}

		System.out.println(sb);
		
	}
}
