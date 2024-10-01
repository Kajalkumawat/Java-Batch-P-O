class MyThread1 extends Thread {
    public void run() {
        System.out.println("parent method");
    }
}

class MyThread2 extends MyThread1 {
    public void run() {
        super.start();//illegal thread state exception 
        System.out.println("child method");
    }
}

public class OverideRun {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        t.start();
    }
}
