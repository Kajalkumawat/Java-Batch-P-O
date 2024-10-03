class MyThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("thread ");
        }
    }
}

public class MethodOfThread {
    public static void main(String[] args) {
        Thread t = new Thread();
        // get name
        System.out.println(t.getName());// default value zero
        // set value insinde the constructor of thread class
        String name = "kajal kumawat";
        // set
        t.setName(name);
        // print getname
        System.out.println(t.getName());
        // thread constructor
        Thread t1 = new Thread("hello world");
        System.out.println(t1.getName());
        // Thread (Runnable , String )
        MyThread t3 = new MyThread();
        Thread t2 = new Thread(t3, "multithreading");
        t2.start();
        System.out.println(t2.getName());
    }
}
