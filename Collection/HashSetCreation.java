import java.util.*;

public class HashSetCreation {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();
        // hetrogenous
        hs.add("hello");
        hs.add(89);
        hs.add('h');
        System.out.println(hs);
        // no duplicate data allow
        hs.add(89);
        hs.add("jii");
        hs.add("hello");
        System.out.println(hs);
        // insertion order does not present
        System.out.println(hs.add("hello"));
    }
}
