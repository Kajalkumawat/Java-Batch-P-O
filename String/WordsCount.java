public class WordsCount {
    public static void main(String[] args) {
        String s = "java is a programming language";
        String a[] = s.split(" ");
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count++;
        }
        System.out.println(count);
    }
}
