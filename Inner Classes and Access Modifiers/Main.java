interface Greeting {
    void greet();
}
public class Main {
    public static void main(String[] args) {
        Greeting obj = new Greeting() {
            public void greet() {
                System.out.println("Hello! Welcome.");
            }
        };

        obj.greet();
    }
}
