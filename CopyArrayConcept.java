public class CopyArrayConcept {
    static void display(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // copy of data type
        int a5 = 23;
        int b5 = a5;
        System.out.println("the value of a is " + a5);
        System.out.println("the value of b is " + b5);
        a5 = 89;
        System.out.println("the value of a is " + a5);
        System.out.println("the value of b is " + b5);

        // deep copy :
        int a1[] = { 1, 2, 3, 4, 5 };
        int b1[] = a1.clone(); // copy of array
        display(a1);
        display(b1);
        a1[0] = 12;
        a1[1] = 13;
        display(a1);
        display(b1);

        // shallow copy : defination self
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = a1; // copy of array
        display(a);
        display(b);
        a[0] = 12;
        a[1] = 13;
        display(a);
        display(b);

    }
}
