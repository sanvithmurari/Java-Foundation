import java.util.*;
class Iterator1 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>(
            Arrays.asList("Apple", "Banana", "Avocado", "Mango"));
        Iterator<String> i = a.iterator();
        while (i.hasNext()) {
            if (i.next().startsWith("A"))
                i.remove();
        }
        System.out.println(a);
    }
}