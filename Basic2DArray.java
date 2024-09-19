public class Basic2DArray {
    public static void main(String[] args) {
        int a[][] = { { 1, 2}, { 4, 5, 6 }, { 7, 8, 9,4 } };
        // first for row and second for column
        for (int i = 0; i < a.length; i++) {
            // second column
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
