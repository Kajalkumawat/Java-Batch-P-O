import java.util.*;

public class HashSetIterator {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(67);
        hs.add(12);
        hs.add(97);
        Iterator itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
