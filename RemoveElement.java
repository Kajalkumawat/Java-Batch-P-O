public class RemoveElement {
    public static void deleteElement(int a[]) {
        int index = 3;
        a[index] = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        deleteElement(a);
    }
}
