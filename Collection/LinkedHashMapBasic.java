import java.util.*;

public class LinkedHashMapBasic {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhs = new LinkedHashMap();
        lhs.put("one", 1);
        lhs.put("two", 2);
        System.out.println(lhs);
        for(Map.Entry l:lhs.entrySet()){
            System.out.println(l.getKey()+" "+l.getValue());
        }
        System.out.println("Values: "+lhs.values());  
    }
}
