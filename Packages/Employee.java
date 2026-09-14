<<<<<<< HEAD
class Employee {
    private int salary = 50000;
    class Payslip {
        void displaySalary() {
            System.out.println("Salary: " + salary);
        }
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee.Payslip p = emp.new Payslip();
        p.displaySalary();
=======
package company.employees;
public class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void display() {
        System.out.println("Employee Name: " + name + " | Salary: $" + salary);
>>>>>>> 4f216bd (Packages in Java)
    }
}
