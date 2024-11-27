import java.util.*;

public class HashmapLoop {
    public static void main(String[] args) {
        HashMap<Integer, String> hs = new HashMap<>();
        hs.put(1, "hello");
        hs.put(6, "hii");
        System.out.println(hs.get(1));
        // Iterator itr=hs.iterator(); iterator does not support in java
        // for each loop
        // Map :interface (Entry =>key+value conmbination =>pair )
        for (Map.Entry h : hs.entrySet()) {
            // key get :getKey method
            // value get :get value method
            System.out.println(h.getKey() + " " + h.getValue());
        }
    }
}