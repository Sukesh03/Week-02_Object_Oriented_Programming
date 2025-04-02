public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "Engineering", 55000);
        emp.displayEmployee();

        Manager mgr = new Manager(201, "Finance", 75000, 3);
        mgr.displayManager();
    }
}

class Manager extends Employee {
    private int level;

    public Manager(int employeeID, String department, double salary, int level) {
        super(employeeID, department, salary);
        this.level = level;
    }

    public void displayManager() {
        System.out.println("Manager ID (public): " + employeeID);
        System.out.println("Department (protected): " + department);
        System.out.println("Salary (via getter): " + getSalary());
        System.out.println("Manager Level: " + level);
        System.out.println();
    }
}
