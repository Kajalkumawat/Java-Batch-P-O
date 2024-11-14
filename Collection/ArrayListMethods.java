import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(687);
        al1.add(89);
        al1.add(98);
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(687);
        al2.add(89);
        al2.add(98);

        // add all
        al1.addAll(al2);
        System.out.println(al1);

        al2.addAll(al1);
        System.out.println(al2);

        al1.removeAll(al2);
        System.out.println(al1);
    }
}
