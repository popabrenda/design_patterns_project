package shopping;

import models.Stationery;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Stationery> items = new ArrayList<>();

    public void addItem(Stationery item) {
        items.add(item);
        System.out.println("Added: " + item);
    }

    public void removeItem(Stationery item) {
        items.remove(item);
        System.out.println("Removed: " + item);
    }

    public void showCart() {
        System.out.println("\nShopping Cart:");
        for (Stationery item : items) {
            System.out.println(" - " + item);
        }
    }
}
