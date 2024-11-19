import java.util.*;

public class LinkedListCreation {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.add("hello");
        ll.add("hiii");
        // create linkedlist through list generic
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("hello");
        ll1.add("hiii");
        System.out.println(ll1);
        // through list
        List<Integer> ll2 = new LinkedList<>();
        ll2.add(67);
        ll2.add(78);
        ll2.add(783);
        System.out.println(ll2);

        Collection<String> ll3 = new LinkedList<>();
        ll3.add("hello");
        ll3.add("hiii");
        System.out.println(ll3);
    }
}