public class AnonymousArray {
    static int sumofarray(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        // want to create
        // new datatype[]{elements of the array};
        // array is always object type
        System.out.println(sumofarray(new int[] { 1, 2, 3, 4, 5 }));
    }
}
