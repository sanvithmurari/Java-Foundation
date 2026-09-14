package company.departments;
import company.employees.Employee;
public class Department {
    private String departmentName;
    private Employee[] employeeList;
    public Department(String departmentName, Employee[] employeeList) {
        this.departmentName = departmentName;
        this.employeeList = employeeList;
    }
    public void display() {
        System.out.println("Department: " + departmentName);
        for (Employee emp : employeeList) {
            emp.display();
        }
    }
}
