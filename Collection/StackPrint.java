import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackPrint {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(89);
        st.push(12);
        st.push(98);
        Iterator itr = st.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        ListIterator litr = st.listIterator();
        while (litr.hasNext()) {
            System.out.print(litr.next() + " ");
        } 
    }
}
