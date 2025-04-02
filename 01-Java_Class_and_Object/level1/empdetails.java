 class employeeDetails {
        private String name;
        private int id;
        private double salary;

        employeeDetails(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        void displayDetails() {
            System.out.println("Name: " + name + "\nID: " + id + "\nSalary: " + salary);
        }
    }

public class empdetails {
    public static void main(String[] args){
        employeeDetails ed=new employeeDetails("Suk",46,300000);
        ed.displayDetails();
    }
}
