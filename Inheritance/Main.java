package Java.Inheritance;

public class Main {
    public static void main(String[] args) {
        Item item = new Item("Generic Item", 5);
        Fruit fruit = new Fruit("Apple", 10, "Bangalore");
        Weapon weapon = new Weapon("Sword", 2, 25, "Melee");

        Bag bag = new Bag();
        bag.addItem(item);
        bag.addItem(fruit);
        bag.addItem(weapon);

        bag.displayItems();
    }
}





// Inheritance in Java is a fundamental principle of OOP that allows a class to
// acquire the properties (fields) and behaviors (methods) of another class.