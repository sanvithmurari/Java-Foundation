import java.util.*;
class Inventory {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Laptop");
        v.add("Mouse");
        v.add("Keyboard");
        v.remove("Mouse");
        synchronized (v) {
            for (String item : v)
                System.out.println(item);
        }
    }
}