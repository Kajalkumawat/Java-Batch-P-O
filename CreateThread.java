//want to create thread normal
//normal convert thread class then used thread class extends 
public class CreateThread extends Thread {
    // createrthread class convert into thread class using exteding thread class
    // ->run method
    public void run() {
        System.out.println("hello world ");
    }

    public static void main(String[] args) {
        // createthread class inactive stage
        // want to convert inactive stage into active stage using start method
        CreateThread t = new CreateThread();
        // thread class inactive stage convert into active stage
        t.start();
    }
}