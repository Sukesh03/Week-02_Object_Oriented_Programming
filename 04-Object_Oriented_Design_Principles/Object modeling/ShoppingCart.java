class Product {
    static double discount = 10.0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Invalid product object.");
        }
    }

    public double calculateTotalPrice() {
        double total = price * quantity;
        double discountAmount = total * (discount / 100);
        return total - discountAmount;
    }
}

class ShoppingCart {
    public static void main(String[] args) {
        Product p1 = new Product(201, "Laptop", 60000.0, 1);
        Product p2 = new Product(202, "Smartphone", 25000.0, 2);
        Product p3 = new Product(203, "Headphones", 1500.0, 3);

        p1.displayProductDetails();
        System.out.println("Total after discount: " + p1.calculateTotalPrice());
        System.out.println();

        p2.displayProductDetails();
        System.out.println("Total after discount: " + p2.calculateTotalPrice());
        System.out.println();

        p3.displayProductDetails();
        System.out.println("Total after discount: " + p3.calculateTotalPrice());
        System.out.println();

        Product.updateDiscount(15.0);
        System.out.println("Updated Discount Applied\n");

        p1.displayProductDetails();
        System.out.println("Total after discount: " + p1.calculateTotalPrice());
    }
}
