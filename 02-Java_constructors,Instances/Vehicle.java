public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 2500.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println();
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ananya", "Scooter");
        Vehicle v2 = new Vehicle("Rohit", "Car");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(3000.0);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
