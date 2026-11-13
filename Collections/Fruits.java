import java.util.*;
class Fruits {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<>();
        s.add("Apple");
        s.add("Mango");
        s.add("Orange");
        System.out.println(s);
        s.remove("Mango");
        System.out.println(s);
    }
}