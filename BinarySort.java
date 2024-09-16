import java.util.*;

public class BinarySort {
    static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void binarySort(int a[]) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            if (a[left] == 1 && a[right] == 0) {
                // swap
            }
            if (a[left] == 0) {
                left++;
            }
            if (a[right] == 1) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 0, 1, 1, 0, 1, 0, 1 };

    }
}
