public class CompareString {
    public static void main(String[] args) {
        String s1 = new String("kajal");
        String s2 = new String("kajal");
        System.out.println(s1 == s2);// false
        System.out.println(s1.equals(s2));// true
    }
}
