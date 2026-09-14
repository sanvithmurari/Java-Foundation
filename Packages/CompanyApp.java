import company.employees.Employee;
import company.departments.Department;

public class CompanyApp {
    public static void main(String[] args) {
        Employee emp1 = new Employee("ABC", 50000);
        Employee emp2 = new Employee("XYZ", 50000);
        Employee[] employees = { emp1, emp2 };
        Department dept = new Department("software", employees);
        dept.display();
    }
}
