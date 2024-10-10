public class ThrowCase2 {
    static ArithmeticException ex = new ArithmeticException();

    public static void main(String[] args) {
        throw ex;
    }
}
