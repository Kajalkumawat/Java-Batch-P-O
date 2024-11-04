public class StringImmutable {
    public static void main(String[] args) {
        // string is immutable
        String s = new String("hello ");
        System.out.println(s);// hello
        s.concat("world");
        System.out.println(s);
    }
}
