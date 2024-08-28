public class Main {
    static int show(int a) {
        return a;
    }

    static int[] array1(int arr[]) {
        return arr;
    }

    static void display(int b[]) {
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println(show(78));
        int m = show(78);
        System.out.println(m);

        int e[] = { 6, 7, 5, 4, 3, 9 };
        int h[] = array1(e);
        display(h);
    }
}