public class Employee {
    int employeeId;
    String employeeName;
    double employeeSalary;

    Employee(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    void annualSalary() {
        double annualSalary = employeeSalary * 12;
        System.out.println("Annual Salary: " + annualSalary);
    }

    void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
        System.out.println("Annual Salary: " + (employeeSalary * 12));

    }

    public static void main(String[] args) {
        Employee employee = new Employee(1, "vela", 5000);
        employee.displayEmployeeInfo();
        employee.annualSalary();
    }
}
