public class FindDuplicate {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 1, 5, 6, 7, 1 };
        int count = 0;
        // array travel with nested loop
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
        }
        System.out.println("Duplicate count is " + count);
    }
}
