import java.util.Arrays;

public class Sort {
    public static void display(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 3, 4, 2, 1, 7, 9, 8, 4, 2 };
        // 1,2,2,3,4,4,7,8,9
        System.out.println("orignal array");
        display(a);
        // sort :predefine method sort method
        System.out.println("sorted array");
        Arrays.sort(a);
        display(a);
    }
}
