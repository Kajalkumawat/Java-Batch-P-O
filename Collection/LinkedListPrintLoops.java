import java.util.*;

public class LinkedListPrintLoops {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("hello");
        ll.add("hiii");
        ll.add("byee");
        // for loop :size method
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
        System.out.println();
        System.out.println("for each loop");
        // for each :
        for (String s : ll) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("iterator through ");
        Iterator itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        System.out.println("List iterator through ");
        ListIterator litr = ll.listIterator();
        while (litr.hasNext()) {
            System.out.print(litr.next() + " ");
        }
        System.out.println();
        System.out.println("backward");
        while(litr .hasPrevious()){
            System.out.print(litr.previous() +" ");
        }
        System.out.println();
        System.out.println("var");
        for(var i:ll){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("object class");
        for(Object o:ll){
            System.out.print(o+" ");
        }
    }
}
