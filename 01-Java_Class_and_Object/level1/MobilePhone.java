public class MobilePhone {
    String brand;
    String model;
    double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : $" + price);
    }

    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S24", 999.99);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 15", 1199.49);

        System.out.println("Phone 1 Details:");
        phone1.displayDetails();

        System.out.println("\nPhone 2 Details:");
        phone2.displayDetails();
    }
}
