public class Employeeencap {
    
    private double salary;

    public void setSalary(double salary){

        // this.salary = salary;

        if(salary < 0){
            System.out.println("Salary cannot be negative.");
        } else {
            this.salary = salary;
        }
    }
    public double getSalary(){
        return salary;
    }
    public static void main(String[] args) {
        Employeeencap employee = new Employeeencap();
        employee.setSalary(5000);
        System.out.println("Employee Salary: " + employee.getSalary());
        employee.setSalary(-1000); // Attempt to set a negative salary
    }
}
