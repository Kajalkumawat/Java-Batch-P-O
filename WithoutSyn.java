class A {
    public void wish(String name) {// step5
        for (int i = 1; i <= 3; i++) {
            System.out.println("Good Morning " + name);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.out.println("got");
            }
        }
    }
}

// thread class
class Thread1 extends Thread {
    A p;
    String name;// step3

    Thread1(A p, String name) {// step2
        this.p = p;
        this.name = name;
    }

    public void run() {
        p.wish(name);// step4
    }
}

public class WithoutSyn {
    public static void main(String[] args) {
        A p = new A();
        Thread1 t1 = new Thread1(p, "kajal");// step1
        Thread1 t2 = new Thread1(p, "garima");
        t1.start();
        t2.start();
    }
}
// output :non synchronized form (kbhi bhi koe bhi thread run ho jaye )