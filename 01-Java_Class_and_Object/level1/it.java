class it{
    int itemCode;
    String itemName;
    double price;
    it(int itemCode, String itemName, double price){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
    }
    public void displaydet(){
        System.out.println("Item Code: "+itemCode);
        System.out.println("Item Name: "+itemName);
        System.out.println("Price: "+price);
    }
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}
