package arrayPractice;

public class ReverseSentence {

	public static void main(String[] args) {
		
		String st = "My name is Selim Shaikh";
		
		
		String [] words = st.split(" ");
		int wordCount = words.length;
		
		System.out.println(wordCount);
		
		int stSize = st.length();
		
		System.out.println("Sentence size is:\n"+stSize);
		
		int spCount =0 ;
		
		for(int i = 0; i< stSize; i++)
		{
			if(st.charAt(i) == ' ')
			{
				spCount++;
			}
		}
		
		System.out.println("Total word count is: "+(spCount+1));
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 4; i >= 0; i--)
		{
			sb.append(words[i]+" ");
		}
		System.out.println(sb);

		
	}

}
