public class RunTimeStackExceptionMeachism {
    void fun1() {
        System.out.println("fun1");
    }

    void fun2() {
        fun1();
        System.out.println("fun2");
        int a = 9 / 0;
        System.out.println(a);
    }

    void fun3() {
        fun2();
        System.out.println("fun3");
        int a = 9 / 0;
        System.out.println(a);
    }

    public static void main(String[] args) {
        new RunTimeStack().fun3();
    }
}
