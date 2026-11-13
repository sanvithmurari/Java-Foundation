import java.util.*;
class Train {
    public static void main(String[] args) {
        LinkedList<String> c = new LinkedList<>();
        c.addFirst("Coach A");
        c.addLast("Coach B");
        c.addFirst("Engine");
        c.addLast("Coach C");
        System.out.println(c);
        c.removeFirst();
        c.removeLast();
        System.out.println("After removal: " + c);
    }
}