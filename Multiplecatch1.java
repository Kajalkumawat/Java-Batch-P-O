public class Multiplecatch1 {
    public static void main(String[] args) {
        try{
            int a=9/0;
            System.out.println(a);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("second catch");
        }
         catch(ArithmeticException ex){
            System.out.println("first catch");
        }
    }
}
