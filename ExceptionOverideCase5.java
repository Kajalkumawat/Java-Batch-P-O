import java.io.IOException;
/*
 * parent class :check exception 
 * child class : exception 
 * then method does not overrided it give error inside the code not possible 
 */
class A {
    void show() throws IOException {
        System.out.println("parent class ");
    }
}

class B extends A {
    void show() throws Exception {
        System.out.println("parent class ");
    }
}

public class ExceptionOverideCase5 {
    public static void main(String[] args) {

    }
}
