/*
 * parent class : exception 
 * child class :check exception 
 * method will be overrided but does not call directly always used try catch block and does not access parent class method 
 */

import java.io.IOException;

class A {
    void show() throws Exception {
        System.out.println("parent class ");
    }
}

class B extends A {
    void show() throws IOException {
        //super.show();
        System.out.println("child class ");
    }
}

public class ExceptionOverideCase6 {
    public static void main(String[] args) {
        B p = new B();
        try {
            p.show();
        } catch (IOException ex) {
            System.out.println("handle");
        }
    }
}
