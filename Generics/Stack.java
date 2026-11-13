import java.util.*;
class Stack<T> {
    ArrayList<T> list = new ArrayList<>();
    void push(T item) { list.add(item); }
    T pop() { return list.remove(list.size() - 1); }
    boolean isEmpty() { return list.isEmpty(); }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        System.out.println(s1.pop());
        Stack<String> s2 = new Stack<>();
        s2.push("Hello");
        System.out.println(s2.pop());
    }
}