public class PrefixSumWithout {
    // print array
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // print prefix sum without extra space
    public static int[] prefix(int a[]) {
        int n = a.length;
        a[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i - 1] + a[i];
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int prefix1[] = prefix(a);
        printArray(prefix1);
    }
}
