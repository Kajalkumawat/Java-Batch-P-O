public class FindUniqueArray {
    static void uniqueElement(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[i] = -1;
                    a[j] = -1;
                }
            }
            if (a[i] > 0) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 1, 2, 3 };
        uniqueElement(a);
    }
}
