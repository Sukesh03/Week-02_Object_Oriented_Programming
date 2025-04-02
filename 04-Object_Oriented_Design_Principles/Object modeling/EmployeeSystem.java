class Employee {
    static String companyName = "TechVision Pvt Ltd";
    private static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
            System.out.println("Company: " + companyName);
        } else {
            System.out.println("Invalid employee object.");
        }
    }
}

class EmployeeSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Ram", "Software Engineer");
        Employee e2 = new Employee(102, "Kumar", "QA Analyst");
        Employee e3 = new Employee(103, "Tej", "Project Manager");

        e1.displayEmployeeDetails();
        System.out.println();
        e2.displayEmployeeDetails();
        System.out.println();
        e3.displayEmployeeDetails();
        System.out.println();

        Employee.displayTotalEmployees();
    }
}
