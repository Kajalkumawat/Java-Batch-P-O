import java.util.*;

public class ArrayListBasic4 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(34);
        al1.add(78);
        al1.add(987);
        // System.out.println(al1);
        ArrayList<Integer> al2 = new ArrayList<>(al1);
        al2.add(45);
        al2.add(78);
        al2.add(67);
        System.out.println(al2);
    }
}
