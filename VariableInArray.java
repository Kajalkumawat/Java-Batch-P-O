class A {
    // instance variable
    int a[];

    void show() {
        System.out.println(a[0]);
    }
}

class B {
    String name = "hello";

    void shw1() {
        System.out.println(name);
    }
}

public class VariableInArray {
    public static void main(String[] args) {
        A p = new A();
        // p.show();
        System.out.println(p.a);//array object type by default null 
        System.out.println(p.a[0]);//null pointer exception 
        B k = new B();
        System.out.println(k.name);
    }
}
