import java.util.*;
class Tasks {
    public static void main(String[] args) {
        LinkedList<String> q = new LinkedList<>();
        q.add("Task 1");
        q.add("Task 2");
        while (!q.isEmpty()) {
            System.out.println("Processing: " + q.removeFirst());
            if (q.isEmpty())
                q.add("Task 3");
            else
                break;
        }
        while (!q.isEmpty())
            System.out.println("Processing: " + q.removeFirst());
    }
}
