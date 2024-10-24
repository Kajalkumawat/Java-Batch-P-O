public class StringConvertPD {
    public static void main(String[] args) {
        String name = "123";
        // convert primtive data type
        Integer i = Integer.parseInt(name);
        System.out.println(i);
        // wrapper convert into primitive data type
        int b = i;
        System.out.println(b);

        // float :
        String h = "8.9";
        Float f = Float.parseFloat(h);
        float g = f;
        System.out.println(g);
    }
}
