public class ReverseSplit {
    public static void main(String[] args) {
        String s = "java is programming language";
        String m[] = s.split(" ");
        for (int i = m.length - 1; i >= 0; i--) {
            System.out.print(m[i] + " ");
        }
    }
}
