import java.util.*;

public class UserInput2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        int row = sc.nextInt();
        System.out.println("enter the cols");
        int cols = sc.nextInt();
        int a[][] = new int[row][cols];
        // user input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("enter value ");
                a[i][j] = sc.nextInt();
            }
        }
        // print :
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
