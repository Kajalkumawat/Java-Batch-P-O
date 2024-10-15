/*
 * parent class : check  
 * child class :check exception 
 * method overrided and always handle through try catch block and super also used 
 * check exception always used try catch block 
 * uncheck exception no need to used try catch 
 */

import java.io.IOException;

class A {
    void show() throws IOException {
        System.out.println("parent class ");
    }
}

class B extends A {
    void show() throws IOException {
        super.show();
        System.out.println("parent class ");
    }
}

public class ExceptionOverideCase7 {
    public static void main(String[] args) {
        B p = new B();
        try {
            p.show();
        } catch (Exception ex) {
            System.out.println("handle");
        }
    }
}
