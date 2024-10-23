class A {
    void show() {
        System.out.println("hello world");
    }
}

public class GetclassMethod {
    public static void main(String[] args) {
        A p=new A();
        System.out.println(p.getClass());
        System.out.println(p.getClass().getName());
    }
}
