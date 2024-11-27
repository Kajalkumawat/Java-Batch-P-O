import java.util.*;

public class HashMapBasic {
    public static void main(String[] args) {
        HashMap<Integer, String> hs = new HashMap<Integer, String>();
        // unique key + unique value
        hs.put(0, "hello");
        hs.put(3, "hii");
        hs.put(6, "bye");
        System.out.println(hs);
        // duplicate key +duplicate value
        hs.put(3, "regex");
        hs.put(5, "hello");
        System.out.println(hs);
        // duplicate null key insert + duplicate null value
        hs.put(null, "hii");
        System.out.println(hs);
        hs.put(null, "kajal");
        System.out.println(hs);
    }
}