public class StringBufferBasic1 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("regex");
        StringBuffer sb2 = new StringBuffer("regex");
        System.out.println(sb1 == sb2);// false
        System.out.println(sb1.equals(sb2));

    }
}
