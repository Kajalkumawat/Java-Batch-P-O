import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println(al.size());
        al.add("hello");
        al.add("hiii");
        al.add("bye");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    } 
}
