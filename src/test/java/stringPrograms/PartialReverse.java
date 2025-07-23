package stringPrograms;

public class PartialReverse {
    public static void main(String[] args) {
    	
        String str = "testing";
        
        String Part1 = str.substring(0, 3);
        
        String Part2 = str.substring(3, 7);
        
        System.out.println(Part1);
        System.out.println(Part2);
        
        String revPart1 = new StringBuilder(Part1).reverse().toString();
        
        String outPut = revPart1 + Part2;
        System.out.println("Desire output is: "+outPut);
   
     }
   
    }


