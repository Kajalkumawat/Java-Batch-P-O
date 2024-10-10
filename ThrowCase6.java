public class ThrowCase6 extends RuntimeException {
    public ThrowCase6(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        throw new ThrowCase6("hello world");
    }
}
