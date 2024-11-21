import java.util.*;

public class LinkedHashSetCreaton {
    public static void main(String[] args) {
        LinkedHashSet hs = new LinkedHashSet<>();
        hs.add("hello");
        hs.add(45);
        System.out.println(hs);
        System.out.println(hs.add("jii"));
    }
}
