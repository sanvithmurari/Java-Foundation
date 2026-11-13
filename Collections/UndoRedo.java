import java.util.*;
class UndoRedo {
    public static void main(String[] args) {
        Stack<String> undo = new Stack<>();
        Stack<String> redo = new Stack<>();
        undo.push("Hello");
        undo.push("Hello World");
        redo.push(undo.pop());  // Undo
        System.out.println("Undo: " + undo.peek());
        undo.push(redo.pop());  // Redo
        System.out.println("Redo: " + undo.peek());
    }
}