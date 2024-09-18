public class PrefixSum {
    // print array
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // print prefix sum with extra space (total number variable used more )
    public static int[] prefix(int a[]) {
        int n = a.length;
        int pre[] = new int[n];
        pre[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            pre[i] = pre[i - 1] + a[i];
        }
        return pre;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int prefix1[] = prefix(a);
        printArray(prefix1);
    }
}
