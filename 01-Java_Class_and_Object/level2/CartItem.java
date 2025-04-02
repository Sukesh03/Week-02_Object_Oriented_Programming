public class CartItem {
    String itemName;
    double price;
    int quantity;

    public void addItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        System.out.println("Item added to cart.");
    }

    public void removeItem() {
        this.quantity = 0;
        System.out.println("Item removed from cart.");
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : $" + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total     : $" + getTotalCost());
    }

    public static void main(String[] args) {
        CartItem item = new CartItem();

        item.addItem("Laptop", 750.0, 2);
        item.displayItem();

        System.out.println();

        item.removeItem();
        item.displayItem();
    }
}
