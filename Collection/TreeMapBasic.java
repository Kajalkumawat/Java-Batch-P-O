import java.util.*;

public class TreeMapBasic {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(4, "hiii");
        tm.put(3, "hello");
        tm.put(2, "ki");
        System.out.println(tm);
        //add null key 
        tm.put(null, null);
        System.out.println(tm); //null pointer exception 
    }
}
