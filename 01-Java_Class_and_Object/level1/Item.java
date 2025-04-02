import java.util.Scanner;
public class Item {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        it item=new it(1,"Bis",20);
        int quantity = scanner.nextInt();
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost: $" + totalCost);
        it item2=new it(2,"Cake",25);
        int quantity2 = scanner.nextInt();
        double totalCost2 = item.calculateTotalCost(quantity2);
        System.out.println("Total Cost: $" + totalCost2);
    }
}
