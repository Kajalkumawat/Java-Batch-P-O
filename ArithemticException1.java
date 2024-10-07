public class ArithemticException1 {
    public static void main(String[] args) {
        try {
            int a = 7;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        }
        // ArithemticException class refrence variable
        catch (ArithmeticException ex) {
            System.out.println("exception handle");
        }
    }
}