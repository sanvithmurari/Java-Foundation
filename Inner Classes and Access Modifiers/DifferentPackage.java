package package2;
import package1.Person;
public class DifferentPackage {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Public: " + p.publicVar);
    }
}
