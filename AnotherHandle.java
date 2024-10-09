public class AnotherHandle {
    public static void main(String[] args) {
        try {
            int a = 9 / 0;
            System.out.println(a);
        } catch (Throwable ex) {
            System.out.println("handle");
        }
    }
}
