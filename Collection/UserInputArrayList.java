import java.util.*;

public class UserInputArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            String x = sc.next();
            al.add(x);
        }
        System.out.println(al);
    }
}
