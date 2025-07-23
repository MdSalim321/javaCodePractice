package hashMap;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

class StringReverse {
	
 public static void main(String[] args) {
	 
     System.out.println("Try programiz.pro");
     String st = "Java is Fun";
     
     String [] words = st.split(" ");
     StringBuilder sb = new StringBuilder();
     for(String wd : words)
     {
        sb.append(new StringBuilder(wd).reverse()).append(" ");
     }
     System.out.println(sb.toString().trim());
 }
}