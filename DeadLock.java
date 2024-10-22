class A {
    public synchronized void show(B b) {
        System.out.println("thread execute");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {

        }
        System.out.println("try to call ");

        b.last();
    }

    public synchronized void last() {
        System.out.println("last method");
    }
}

class B {
    public synchronized void show(A p) {
        System.out.println("thread execute");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {

        }
        System.out.println("try to call ");
        p.last();

    }

    public synchronized void last() {
        System.out.println("last method");
    }
}

public class DeadLock implements Runnable {
    A a = new A();
    B p = new B();

    public DeadLock() {
        Thread t = new Thread(this);
        t.start();
        a.show(p);
    }

    public void run() {
        p.show(a);
    }

    public static void main(String[] args) {
       new DeadLock();
    
    }
}
