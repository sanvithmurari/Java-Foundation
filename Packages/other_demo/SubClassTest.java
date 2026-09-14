package other_demo;
import access_demo.Demo;
public class SubClassTest extends Demo {
    public static void main(String[] args) {
        SubClassTest obj = new SubClassTest();
        System.out.println(obj.c);
        System.out.println(obj.d);
        obj.show();
    }
}