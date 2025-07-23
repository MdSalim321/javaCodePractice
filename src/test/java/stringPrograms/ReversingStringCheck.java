package stringPrograms;

public class ReversingStringCheck {

	public static void main(String[] args) {

		String st = "Selim";
		String revPar = "";
		
		for (int i = 2; i >= 0; i--) {
			revPar = revPar + st.charAt(i);
		}	
		String st2 = st.substring(3, 5);
		System.out.println(revPar+st2);
		
		
		StringBuilder revfinal = new StringBuilder();
		revfinal.append(revPar);
		revfinal.append(st2);
		
		System.out.println("partial reverse string is: "+revfinal);

	}
}
