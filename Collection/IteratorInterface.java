import java.util.*;

public class IteratorInterface {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(45);
        al.add(12);
        al.add(79);
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
