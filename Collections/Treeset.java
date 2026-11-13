import java.util.*;
class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<>(
            Arrays.asList(5, 2, 8, 1, 4));
        System.out.println("Ascending: " + s);
        System.out.println("Descending: " + s.descendingSet());
    }
}