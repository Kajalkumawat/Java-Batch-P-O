class A {
    static int a[];

    void show() {
        System.out.println(a[0]);
    }
}

public class StaticVariableInArray {
    public static void main(String[] args) {
        // int a[];
        // System.out.println(a[0]);
        A p = new A();
        // p.show(); null pointer exception
        System.out.println(p.a);
        System.out.println(p.a[0]);
    }
}
