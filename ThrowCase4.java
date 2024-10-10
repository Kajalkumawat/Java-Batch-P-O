public class ThrowCase4 {
    public static void main(String[] args) {
        throw new ArithmeticException("hello");
        System.out.println("hello");
        //compile time :unreachable statement error 
    }
}
