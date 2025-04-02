class Vehicle {
    static double registrationFee = 5000.0;

    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Invalid vehicle object.");
        }
    }
}

class VehicleSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("MH01AB1234", "Ravi", "Car");
        Vehicle v2 = new Vehicle("KA05XY9876", "Anita", "Bike");
        Vehicle v3 = new Vehicle("DL09GH5678", "Suresh", "Truck");

        v1.displayRegistrationDetails();
        System.out.println();
        v2.displayRegistrationDetails();
        System.out.println();
        v3.displayRegistrationDetails();
        System.out.println();

        Vehicle.updateRegistrationFee(5500.0);
        System.out.println("Updated Registration Fee Applied\n");

        v1.displayRegistrationDetails();
    }
}
