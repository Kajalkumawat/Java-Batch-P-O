public class PDConvertString {
    public static void main(String[] args) {
        // primtive data type convert into string toString
        // step1 :PD convert into WC
        int a = 10;
        Integer p = Integer.valueOf(a);
        // wc convert into String
        String s = p.toString();
        System.out.println(s);
    }
}
