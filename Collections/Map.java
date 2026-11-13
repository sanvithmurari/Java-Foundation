import java.util.*;
class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<>();
        m.put(1, "Amit");
        m.put(2, "Rahul");
        m.put(3, "Priya");
        System.out.println(m);
        m.remove(2);
        System.out.println(m);
    }
}
