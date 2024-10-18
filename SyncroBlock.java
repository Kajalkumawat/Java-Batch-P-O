class A {
    public void table(int n) {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(n * i + " ");
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                }
            }
        }
    }
}

class B extends Thread {
    A p;

    B(A p) {
        this.p = p;
    }

    public void run() {
        p.table(6);
    }
}

class C extends Thread {
    A k;

    C(A k) {
        this.k = k;
    }

    public void run() {
        k.table(8);
    }
}

public class SyncroBlock {
    public static void main(String[] args) {
        A p = new A();
        B k = new B(p);
        C l = new C(p);
        k.start();
        l.start();
    }
}
