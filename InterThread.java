class A extends Thread {
    // instance variable
    int total = 0;

    public void run() {
        synchronized (this) {
            System.out.println("first time");//step2
            for (int i = 1; i <= 10; i++) {
                total = total + i;
            }
            System.out.println("second time");//step3
            this.notify();
            System.out.println("inside the notify");
        }
    }
}

public class InterThread {
    public static void main(String[] args) throws InterruptedException {
        A p = new A();
        p.start();
        synchronized (p) {
            System.out.println("third time");//step1
            p.wait();
            System.out.println("fourth time ");//step4
            System.out.println(p.total);//step5 
        }
    }
}
