import java.util.*;
class Postfix {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        String exp = "23+4*";
        for (char c : exp.toCharArray()) {
            if (Character.isDigit(c))
                s.push(c - '0');
            else {
                int b = s.pop(), a = s.pop();
                switch (c) {
                    case '+': s.push(a + b); break;
                    case '-': s.push(a - b); break;
                    case '*': s.push(a * b); break;
                    case '/': s.push(a / b); break;
                }
            }
        }
        System.out.println("Result: " + s.pop());
    }
}