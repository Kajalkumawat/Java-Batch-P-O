import java.util.*;

class A {
    int a;
    String name;

    public A(int a, String name) {
        this.a = a;
        this.name = name;
    }
}

public class UserDefineHashSet {
    public static void main(String[] args) {
        A p = new A(45, "hello");
        HashSet<A> hs = new HashSet<>();
        hs.add(p);
        for (A r : hs) {
            System.out.println(r.a + " " + r.name);
        }
    }
}
