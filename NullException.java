public class NullException {
    public static void main(String[] args) {
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException ex) {
            System.out.println("handle");
        }
    }
}
