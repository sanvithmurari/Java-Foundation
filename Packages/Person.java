package package1;
public class Person {
    private int privateVar = 10;
    int defaultVar = 20;
    protected int protectedVar = 30;
    public int publicVar = 40;
    public void showPrivate() {
        System.out.println("Private: " + privateVar);
    }
}