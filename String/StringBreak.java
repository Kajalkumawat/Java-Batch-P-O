public class StringBreak {
    public static void main(String[] args) {
        String s = "java is a programming language";
        String m[] = s.split(" ");
        System.out.println(m[0]);
        System.out.println(m[1]);
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
    }
}
