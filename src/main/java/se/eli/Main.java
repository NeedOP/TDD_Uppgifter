package se.eli;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Laptop", 1000.00, 1);
        Item item2 = new Item("Phone", 500.00, 2);

        double discount = 10.0;

        printTotals(item1, item2, discount);
        printTotals(item1, item2, discount); // Samma beräkning igen
    }

    public static void printTotals(Item item1, Item item2, double discount) {
        double totalBeforeDiscount = item1.getTotalPrice() + item2.getTotalPrice();
        double discountAmount = totalBeforeDiscount * (discount / 100);
        double totalAfterDiscount = totalBeforeDiscount - discountAmount;

        System.out.println("Total before discount: $" + totalBeforeDiscount);
        System.out.println("Discount: $" + discountAmount);
        System.out.println("Total after discount: $" + totalAfterDiscount);
    }
}

class Item {
    private final String name;
    private final double price;
    private final int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }
}
