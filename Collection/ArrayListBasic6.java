import java.util.*;

public class ArrayListBasic6 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("hello");
        al.add("hiii");
        al.add("bye");
        al.add("tata");
        ListIterator litr = al.listIterator();
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }
    }
}
