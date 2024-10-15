/*
 * parent class :uncheck  
 * child class :check exception 
 * then method does not overrided it give error of the code 
 */

import java.io.IOException;

class A {
    void show() throws ArithmeticException {
        System.out.println("parent class");
    }
}
class B extends A{
    void show() throws IOException {
        System.out.println("parent class");
    }
}
public class ExceptionOverideCase8 {
    public static void main(String[] args) {

    }
}
