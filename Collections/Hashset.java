import java.util.*;
class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> b = new HashSet<>(Arrays.asList(2, 3, 4));
        HashSet<Integer> u = new HashSet<>(a);
        u.addAll(b);
        System.out.println("Union: " + u);
        HashSet<Integer> i = new HashSet<>(a);
        i.retainAll(b);
        System.out.println("Intersection: " + i);
        HashSet<Integer> d = new HashSet<>(a);
        d.removeAll(b);
        System.out.println("Difference: " + d);
    }
}