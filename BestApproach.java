// runnable approach best for achive multithreading 
// ->runnable is a interface easy to used another class property 

// when thread class used then does not access another class property because of in java multiple interitance does not support 

class MyThread {
    void show() {
        System.out.println("show method");
    }
}

// it always make thread
class MyThread1 extends MyThread implements Runnable {
    public void run() {
        System.out.println("runnable interface");
    }
}

public class BestApproach {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        t.show();
        Thread th = new Thread(t);
        th.start();
    }
}
