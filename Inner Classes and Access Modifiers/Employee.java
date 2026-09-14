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
    }
}
