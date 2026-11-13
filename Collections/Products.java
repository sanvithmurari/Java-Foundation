import java.util.*;
class Products {
    public static void main(String[] args) {
        ArrayList<String> p = new ArrayList<>(
            Arrays.asList("Laptop", "Mobile", "Laptop Bag"));
        String key = "laptop";
        for (String s : p)
            if (s.toLowerCase().contains(key.toLowerCase()))
                System.out.println(s);
    }
}