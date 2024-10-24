public class WcConvertPD {
    public static void main(String[] args) {
        // autoboxing : value
        Integer i = 78;
        int j = i;
        System.out.println(j);
        int y= i.intValue();
        System.out.println(y);

        int x= Integer.valueOf(i);
        System.out.println(x);
    }
}
