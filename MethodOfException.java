class A {
    void show1() {
        try {
            int a = 9 / 0;
            System.out.println(a);
        } catch (ArithmeticException ex) {
            System.out.println(ex); // name + description (no stack )
        }
    }

    void show2() {
        try {
            int a = 9 / 0;
            System.out.println(a);
        } catch (ArithmeticException ex) {
            ex.printStackTrace(); // name +description + location(Stack)
            System.out.println(ex);
        }
    }

    void show3() {
        try {
            int a = 9 / 0;
            System.out.println(a);
        } catch (ArithmeticException ex) {
            System.out.println(ex.toString()); // name +description (no location)
        }
    }

    void show4() {
        try {
            int a = 9 / 0;
            System.out.println(a);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage()); // only message description
        }
    }
}

public class MethodOfException {
    public static void main(String[] args) {
        A p = new A();
        p.show1();
        p.show2();
        p.show3();
        p.show4();
    }
}
