package access_demo;
public class SamePackageTest {
    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
        obj.show();
    }
}
