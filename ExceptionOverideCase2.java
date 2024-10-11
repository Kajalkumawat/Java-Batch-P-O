/*
 * parent class :Exception same
 * child class :Exception same 
 * then it is overrided and easily solve the problem through super keyword using try catch 
 */
class A {
    void show() throws Exception {
        System.out.println("parent class ");
    }
}

class B extends A {
    void show() throws Exception {
        super.show();
        System.out.println("child class ");
    }
}

public class ExceptionOverideCase2 {
    public static void main(String[] args) {
        B p = new B();
        try {
            p.show();
        } catch (Exception ex) {
            System.out.println("handle");
        }
    }

}
