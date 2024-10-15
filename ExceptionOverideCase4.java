/*
 * parent class :uncheck exception 
 * child class : exception 
 * then method does not overrided it give error inside the code not possible 
 */
class A {
    void show() throws ArithmeticException {
        System.out.println("parent class");
    }
}

class B extends A {
    void show() throws Exception {
        System.out.println("child class ");
    }
}

public class ExceptionOverideCase4 {
    public static void main(String[] args) {

    }
}
