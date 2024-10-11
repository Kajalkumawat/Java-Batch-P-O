// case 1 : 
// parent class -->Exception  

// child class --->unchecked Exception 

// it is overrided but does not solve problem of method overriding 

class A{
    void show() throws Exception{
        System.out.println("parent class ");
    }
}
class B extends A{
    void show() throws ArithmeticException{
      //  super.show();
        System.out.println("child class ");
    }
}
public class ExceptionOverideCase1 {
    public static void main(String[] args) {
       B p=new B();
       p.show(); 
    }
}
