import java.util.*;

public class PascleTriangle {
    // print 2 D array
    static void printArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // make traingle
    public static int[][] pascle(int n) {
        // 2 D array
        int ans[][] = new int[n][];
        for (int i = 0; i < n; i++) {
            // for every row
            ans[i] = new int[i + 1];
            // for all first and last elemnent of the traingle is 1
            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        int n = sc.nextInt();
        int ans[][] = pascle(n);
        printArray(ans);
    }
}
