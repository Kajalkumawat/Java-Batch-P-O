class MyThread extends Thread {
    public void run() {
        System.out.println("run method");
    }
}

public class CallStart {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        // when call multiple start method in multithreading then give exception illegal
        // thread exception
        t.start();
        t.start();
    }
}
