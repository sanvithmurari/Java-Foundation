abstract class Employee {
    String name;
    double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateBonus();

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }
    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }
    double calculateBonus() {
        return salary * 0.10;
    }

    public static void main(String[] args) {
        Employee manager = new Manager("ABC", 80000);
        Employee developer = new Developer("XYZ", 60000);
        manager.showDetails();
        System.out.println();
        developer.showDetails();
    }
}
