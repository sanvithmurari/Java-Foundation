import java.util.*;
class Literator {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        ListIterator<String> i = l.listIterator();
        while (i.hasNext())
            System.out.println(i.next());
        while (i.hasPrevious())
            System.out.println(i.previous());
    }
}