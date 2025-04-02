public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.dailyRate = 1500.0;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = getRateForModel(carModel);
    }

    private double getRateForModel(String model) {
        switch (model.toLowerCase()) {
            case "sedan": return 2000.0;
            case "suv": return 3000.0;
            case "hatchback": return 1500.0;
            default: return 1800.0;
        }
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: " + dailyRate);
        System.out.println("Total Cost: " + calculateTotalCost());
        System.out.println();
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        CarRental rental2 = new CarRental("Ravi Kumar", "SUV", 5);

        rental1.displayRentalDetails();
        rental2.displayRentalDetails();
    }
}
