package se.eli;

import se.eli.animal.Bird;
import se.eli.animal.Dog;
import se.eli.animal.IAnimal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Rabatt-exempel
        Item item1 = new Item("Laptop", 1000.00, 1);
        Item item2 = new Item("Phone", 500.00, 2);

        double discount = 10.0;

        printTotals(item1, item2, discount);
        printTotals(item1, item2, discount); // Samma beräkning igen

        System.out.println("\n--- Animal sounds ---");

        // Polymorfism-exempel
        IAnimal bird = new Bird();
        IAnimal dog = new Dog();

        List<IAnimal> animals = new ArrayList<>();
        animals.add(bird);
        animals.add(dog);

        for (IAnimal animal : animals) {
            animal.makeSound();
        }
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
