import java.util.*;
class Student {
    String name;
    int age;
    Student(String n, int a) {
        name = n;
        age = a;
    }
    public String toString() {
        return name + " " + age;
    }
}

class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.age != s2.age)
            return s1.age - s2.age;
        return s1.name.compareTo(s2.name);
    }
}
class Compartor {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Ravi", 20));
        s.add(new Student("Amit", 19));
        s.add(new Student("Anu", 20));
        Collections.sort(s, new AgeComparator());
        System.out.println(s);
    }
}