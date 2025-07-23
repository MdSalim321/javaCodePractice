package hashMap;

import java.util.*;

public class MapToList {
    public static void main(String[] args) {
    	
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("A", 10);
        map.put("B", 20);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        
        System.out.println(list);
    }
}



