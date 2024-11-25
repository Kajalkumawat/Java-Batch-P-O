import java.util.*;

public class LinkedHashSetItyerator {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Apple");
        lhs.add("helooo");
        Iterator itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();
        for (String l : lhs) {
            System.out.print(l + " ");
        }
    }
}
