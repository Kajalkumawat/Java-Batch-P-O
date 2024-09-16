public class SortOddEven {
    // print array
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // swap method
    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    static void EvenSOrt(int a[]) {
        // index
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            // first left index element even and right index element odd swap
            if (a[left] % 2 == 0 && a[right] % 2 == 1) {
                // swap
                swap(a, left, right);// method
                left++;
                right--;
            }
            // left a of index element odd
            if (a[left] % 2 == 1) {
                left++;
            }
            // right of index element even
            if (a[right] % 2 == 0) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        EvenSOrt(a);
        printArray(a);
    }
}
