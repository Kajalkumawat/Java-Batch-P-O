/*
 * parent class :check  
 * child class :uncheck exception 
 *then method overrided and solve problem   
 */

import java.io.IOException;

class A {
    void show() throws IOException {
        System.out.println("Parent class method");
    }
}

class B extends A {
    void show() throws ArithmeticException {
        try {
            super.show();
        } catch (IOException ex) {
            System.out.println("handle");
        }
        System.out.println("Child class method");
    }
}

public class Ex9 {
    public static void main(String[] args) {
        B k = new B();
        k.show();
    }
}
