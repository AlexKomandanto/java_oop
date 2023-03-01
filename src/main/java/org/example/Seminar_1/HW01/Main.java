package org.example.Seminar_1.HW01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        // create some HotDrink objects
        HotDrink hotDrink1 = new HotDrink("Coffee", 12, 70);
        HotDrink hotDrink2 = new HotDrink("Tea", 8, 80);
        HotDrink hotDrink3 = new HotDrink("Cocoa", 10, 65);

        // add them to a list
        List<HotDrink> hotDrinks = new ArrayList<>();
        hotDrinks.add(hotDrink1);
        hotDrinks.add(hotDrink2);
        hotDrinks.add(hotDrink3);

        // create HotDrinkVendingMachine object
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine(hotDrinks);

        // let the customer buy the item
        HotDrink product = vendingMachine.getProduct("Coffee", 12, 70);
        if (product != null) {
            System.out.println("Enjoy your " + product.getName());
        } else {
            System.out.println("Sorry, product not found.");
        }
    }
}
