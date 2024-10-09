public class Multiple3 {
    public static void main(String[] args) {
        try{
            int a[]=new int[4];
            a[5]=7/0; 
            System.out.println(a[5]);
        }
        catch(ArithmeticException ex){
            System.out.println("arithemtic handle");
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("array");
        }
    }   
}
