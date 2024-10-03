class MyThread implements Runnable {
    public void run() {
        System.out.println("child thread");
    }
}

public class RunnableInt {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread t1 = new Thread(t);
        t1.start();
    }
}
