package se.eli;

import se.eli.animal.Bird;
import se.eli.animal.Dog;
import se.eli.animal.IAnimal;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        //Items
        Item item1 = new Item("Laptop", 1000.00,1);
        Item item2 = new Item("Phone", 500.00, 2);

        double totalBeforeDiscount = item1.getTotalPrice() + item2.getTotalPrice();
        System.out.println("Total price before discount: " + totalBeforeDiscount);


        // Discount
        double discount = 10.0;
        double discountAmount = totalBeforeDiscount * (discount / 100);
        double totalAfterDiscount = totalBeforeDiscount - discountAmount;
        System.out.println("Discount: $" + discountAmount);
        System.out.println("Total after discount: $" + totalAfterDiscount);

        List<IAnimal> animalList = new ArrayList<>();

        IAnimal bird = new Bird();
        IAnimal dog = new Dog();


        animalList.add(bird);
        animalList.add(dog);

        for (IAnimal animal : animalList) {
            animal.makeSound();
        }

        Product product1 = new Product("Phone", 2000.00);
        Product product2 = new Product("Laptop", 5000.00);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        // Räkna ut totalpriset
        double totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        System.out.println("Total price before discount: $" + totalPrice);

        IDiscount discount1 = new TwentyFivePercentDiscount();
        double discountedPrice = discount1.applyDiscount(totalPrice);

        System.out.println("Total price after discount: $" + discountedPrice);
    }

}
