public class ConceptOfString {
    public static void main(String[] args) {
        String s = new String("hello ");
        System.out.println("first time " + s);
        // concat
        s.concat("world");
        System.out.println("second time" + s);
        s = s.concat("duniya");
        System.out.println("third time " + s);
    }
}
