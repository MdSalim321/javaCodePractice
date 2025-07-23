package hashMap;

public class CheckDigit {
	
    public static void main(String[] args) {
    	
        String str = "123456";
        boolean isDigit = str.matches("\\e+");
        System.out.println(isDigit);
    }
}
