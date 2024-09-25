public class Multi2D {
    public static void printArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiply(int a[][], int b[][]) {
        int multi[][] = new int[3][3];
        // row
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    multi[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        printArray(multi);
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
        int b[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
        multiply(a, b);
    }
}