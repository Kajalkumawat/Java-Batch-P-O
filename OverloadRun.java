class MyThread extends Thread {
    public void run() {
        System.out.println("normal method");
    }

    public void run(int a) {
        System.out.println(a);
    }
}

public class OverloadRun {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
