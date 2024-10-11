/*
 * parent class :uncheck exception 
 * child class :uncheck exception 
 * method overrided and solve problem and no need to use try catch 
 */
class A {
    void show() throws ArithmeticException {
        System.out.println("parent class ");
    }
}

class B extends A {
    void show() throws ArithmeticException {
        super.show();
        System.out.println("child class ");
    }
}

public class ExceptionOverideCase3 {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }

}
