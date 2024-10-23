class A {
    int a;

    A(int a) {
        this.a = a;
    }

    public int hashCode() {
        return a;
    }
}

public class Hashcode1 {
    public static void main(String[] args) {
        A p = new A(67);
        System.out.println(p.hashCode());
    }
}
