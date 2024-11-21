import java.util.*;

public class HashsetLoop {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(89);
        hs.add(178);
        System.out.println(hs);
        // for loop not possible because absence of get method
        for (int i : hs) {
            System.out.print(i + " ");
        }
    }
}