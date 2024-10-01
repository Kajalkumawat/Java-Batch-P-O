class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("child thread");
        }
    }
}

public class RunMethod {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.run(); //run method is normal method 
        //start method then thread execute 
        for (int i = 1; i <= 3; i++) {
            System.out.println("parent thread");
        }
    }
}
