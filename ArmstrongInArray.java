public class ArmstrongInArray {
    public static void main(String[] args) {
        int a[] = { 151, 152, 153, 154, 155 };
        int temp = 0, sum = 0, rem = 0;
        for (int i = 0; i < a.length; i++) {
            temp = a[i];
            sum = 0;
            while (temp > 0) {
                rem = temp % 10;
                sum = sum + rem * rem * rem;
                temp = temp / 10;
            }
            if (sum == a[i]) {
                System.out.println(sum);
            }
        }
    }
}