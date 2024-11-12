
import java.util.*;

public class AllInterface {
    public static void main(String[] args) {
        Iterable itr = new ArrayList();
        // itr.add("hello"); element does not stored

        Collection cc = new ArrayList();
        cc.add("hello");
        System.out.println(cc);

        List al = new ArrayList();
        al.add(345);
        System.out.println(al);
    }
}
