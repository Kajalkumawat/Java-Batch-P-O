class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("thread execute");
            try {

                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
}

public class Daemonthread {
    public static void main(String[] args) {
        A p = new A();
        p.setDaemon(true);
        p.start();
        System.out.println("main thread execute");
    }
}
