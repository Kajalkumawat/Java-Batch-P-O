public class PrintString {
    public static void main(String[] args) {
        String s = "hello"; // hello through loop
        // string convert char array type
        char a[] = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
