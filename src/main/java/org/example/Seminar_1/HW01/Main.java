package org.example.Seminar_1.HW01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        HotDrink customerDrink = selectDrinkFromConsole(vendingMachine);
        if (customerDrink != null) {
            System.out.println("Enjoy your " + customerDrink.getName() + "!");
        } else {
            System.out.println("Sorry, product not found.");
        }
    }
    // method to select a drink from the console
    public static HotDrink selectDrinkFromConsole(HotDrinkVendingMachine vendingMachine) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter drink name: ");
        String name = scanner.nextLine();
        System.out.print("Enter drink volume: ");
        int volume = scanner.nextInt();
        System.out.print("Enter drink temperature: ");
        int temperature = scanner.nextInt();
        return vendingMachine.getProduct(name, volume, temperature);
    }




}
