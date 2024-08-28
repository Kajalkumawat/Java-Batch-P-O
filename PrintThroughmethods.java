public class PrintThroughmethods {
    // want to print all the array elements through method
    public static void display(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        display(a);
    }
}
