public class RotateArray {
    static void rotation(int a[]) {
        // last element store at the last position
        int temp = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = temp;
    }

    public static void rotate(int a[]) {
        for (int i = 1; i < 3; i++) {
            rotation(a);
        }
    }

    static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        rotate(a);
        print(a);
    }
}
