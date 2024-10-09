public class StopCode {
    public static void main(String[] args) {
        try{
            int a=9/0;
            System.out.println(a);
        }
        catch(Exception ex){
            System.out.println("handle");
            System.exit(0);
        }
        finally{
            System.out.println("finally block");
        }
        System.out.println("rest of code ");
      }
}
