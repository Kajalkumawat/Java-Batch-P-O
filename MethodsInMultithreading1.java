class A extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            Thread.yield();
            System.out.println("parent child");
        }
    }
}

public class MethodsInMultithreading1 {
    public static void main(String[] args) {
        A k = new A();
        k.start();
        for (int i = 1; i <= 3; i++) {
            System.out.println("main thread");
        }
    }
}