public class BasicStringBuffer {
    public static void main(String[] args) {
        final StringBuffer sb = new StringBuffer("hello");
        sb.append("world");
        System.out.println(sb);
        sb = sb.append("duniya");
        System.out.println(sb);
        //giver error final does not ressign value 
    }
}
