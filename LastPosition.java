public class LastPosition {
    public static void main(String[] args) {
        int a[] = { 1, 2, 1, 3, 8, 1 };
        int count = 0;
        int target = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                count=i;
            }
        }
        System.out.println(a[count]);
    }
}