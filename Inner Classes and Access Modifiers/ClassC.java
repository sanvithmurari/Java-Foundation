package package2;
import package1.ClassA;
public class ClassC {
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        obj.x = 10; 
        System.out.println(obj.x);
    }
}
