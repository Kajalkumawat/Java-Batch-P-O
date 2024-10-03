class MyThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("child thread");
        }
    }
}

public class Concept2Runnable {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        //t1.run();
        //t1.start();//error 
        //runable interface does not call start method 
        //start method is method of thread class 
        //run method is method of runnable interface 
        Thread t = new Thread(t1);
        t.run();
        for (int i = 1; i <= 3; i++) {
            System.out.println("parent thread");
        }
    }
}
