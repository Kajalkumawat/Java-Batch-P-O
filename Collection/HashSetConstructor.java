import java.util.*;
public class HashSetConstructor {
    public static void main(String[] args) {
        //HashSet hs=new HashSet(Collection v);
        ArrayList<String> al=new ArrayList<>();
        al.add("hello");
        al.add("word");
        LinkedList<String> ll=new LinkedList<>(al);
        ll.add("linkedlist");
        ll.add("hii");
        System.out.println(ll); 
    }
}
