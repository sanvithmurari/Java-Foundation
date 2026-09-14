package package1;
public class SamePackage {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Default: " + p.defaultVar); 
        System.out.println("Protected: " + p.protectedVar);
        System.out.println("Public: " + p.publicVar); 
        p.showPrivate();
    }

}