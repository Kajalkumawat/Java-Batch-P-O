public class ThrowNew extends Exception {
    public static void voterid(int age) {
        if (age < 18) {
            throw new ArithmeticException("you are not valid for vote");
        } else {
            System.out.println("you are valid for vote");
        }
    }

    public static void main(String[] args) {
        voterid(3);
    }
}
