package org.example.Seminar_1.HW01;

import java.util.ArrayList;
import java.util.List;

// HotDrinkVendingMachine class implementing VendingMachine interface
public class HotDrinkVendingMachine implements VendingMachine {
    private List<HotDrink> hotDrinks = new ArrayList<>();

    public HotDrinkVendingMachine(List<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    // overloaded getProduct method returning HotDrink object based on name, volume, and temperature
    public HotDrink getProduct(String name, int volume, int temperature) {
        for (HotDrink hotDrink : hotDrinks) {
            if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature) {
                return hotDrink;
            }
        }
        return null; // if no product found, return null
    }
}
