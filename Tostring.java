class A{
    int a;
    A(int a){
        this.a=a;
    }
    public String toString(){
        return a+"";
    }
}
public class Tostring{
    public static void main(String[] args) {
        A p=new A(67);
        System.out.println(p.toString());
    }
}