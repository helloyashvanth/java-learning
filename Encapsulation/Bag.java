package Java.Encapsulation;

import java.util.ArrayList;

public class Bag {

    private ArrayList<Item> items;

    Bag() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        for (Item i : items) {
            System.out.println("Name: " + i.getName() + ", Quantity: " + i.getQuantity());
        }
    }
}
