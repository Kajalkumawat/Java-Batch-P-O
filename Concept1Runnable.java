//jvm always work on main method thread then execute another thread
class MyThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("child thread");
        }
    }
}

public class Concept1Runnable {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread t = new Thread(t1);
        t.start();
        // main thread
        for (int i = 1; i <= 3; i++) {
            System.out.println("main thread");
        }
    }
}
