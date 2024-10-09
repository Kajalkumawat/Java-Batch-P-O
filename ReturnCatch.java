public class ReturnCatch {
    public static void main(String[] args) {
        try{
            int a=9/0;
            System.out.println(a);
        }
        catch(Exception ex){
            System.out.println("handle");
            return;
        }
        finally{
            System.out.println("finally block");
        }
        
      }
}
