import java.util.*;

public class ArrayListBasic5 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(687);
        al1.add(89);
        al1.add(98);
        System.out.println(al1);

        // update
        al1.set(2, 74323);
        System.out.println(al1);

        al1.remove(1);
        System.out.println(al1);

    }
}
