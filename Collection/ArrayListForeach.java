import java.util.*;

public class ArrayListForeach {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(45);
        al.add(12);
        al.add(79);
        for (int i : al) {
            System.out.print(i + " ");
        }
    }
}