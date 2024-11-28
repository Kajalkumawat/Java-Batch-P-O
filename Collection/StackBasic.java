import java.util.*;

/*Stack : 
->LIFO (last in first out )
->Operations :push (add element )
pop :topmost element remove 
peek : top element print 
size :length  */
public class StackBasic {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(89);
        st.push(12);
        st.push(98);
        // stack is resizable
        System.out.println(st);
        st.pop();
        System.out.println(st);

        System.out.println(st.peek());
        System.out.println(st.size());
    }
}