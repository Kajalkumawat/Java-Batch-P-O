public class RunTimeStack {
    void fun1() {
        System.out.print("fun1");
    }

    void fun2() {
        fun1();
        System.out.println("fun2");
    }

    void fun3() {
        fun2();
        System.out.println("fun3");
    }

    public static void main(String[] args) {
        new RunTimeStack().fun3();
    }
}
