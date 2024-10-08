public class NumberFormat {
    public static void main(String[] args) {
        try {
            String a = "hi";
            int b = Integer.parseInt(a);
            System.out.println(b);
        } catch (NumberFormatException ex) {
            System.out.println("handle");
        }
    }
}
