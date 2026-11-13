import java.util.*;

class Marks {
    public static void main(String[] args) {
        ArrayList<Double> m = new ArrayList<>(
            Arrays.asList(80.0, 90.0, 70.0));
        double sum = 0;
        for (double x : m) 
            sum += x;
        System.out.println("Average: " + sum / m.size());
        System.out.println("Highest: " + Collections.max(m));
        System.out.println("Lowest: " + Collections.min(m));
        Collections.sort(m);
        System.out.println("Sorted: " + m);
    }
}