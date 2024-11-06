public class StringConstructor4 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        String s = new String(sb);
        System.out.println(s);
    }
}
