package arrayPractice;
import java.util.HashSet;
public class DuplicateString {

	public static void main(String[] args) {

		String st = "abc def fcb acd";
		st = st.replaceAll(" ", "");
		System.out.println(st);
		
		HashSet set = new HashSet();
		
		StringBuilder sb = new StringBuilder();
		
		for( char c: st.toCharArray())
		{
			if(set.add(c))
			{
				sb.append(c);
			}
		}
		
	System.out.println(set);
	System.out.println(sb);
		
	}

}
