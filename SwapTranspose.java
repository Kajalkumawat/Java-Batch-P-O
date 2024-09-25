public class SwapTranspose {
    public static void printArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void swapTranspose(int a[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        printArray(a);
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("orignal array");
        printArray(a);
        System.out.println("transpose array");
        swapTranspose(a);
    }
}
