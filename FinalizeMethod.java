public class FinalizeMethod {
    public void finalize() {
        System.out.println("call");
    }

    public static void main(String[] args) {
        FinalizeMethod s1 = new FinalizeMethod();
        FinalizeMethod s2 = new FinalizeMethod();
        s1 = null;
        s2 = null;
        System.gc();
    }
}
