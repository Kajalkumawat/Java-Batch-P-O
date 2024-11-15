import java.util.*;

class A {
    int a;
    String name;

    A(int a, String name) {
        this.a = a;
        this.name = name;
    }
}

public class UserDefineGeneric {
    public static void main(String[] args) {
        A p1 = new A(45, "hello");
        A p2 = new A(89, "hiii");
        A p3 = new A(43, "bye");
        ArrayList<A> al = new ArrayList<>();
        al.add(p1);
        al.add(p2);
        al.add(p3);
        System.out.println(al);
        // print all the elemnts
        for (A j : al) {
            System.out.println(j.a + " " + j.name);
        }
    }
}
