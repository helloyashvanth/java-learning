package Java.Encapsulation;

public class Main {
    public static void main(String[] args) {

        Bag bag = new Bag();

        Item item1 = new Item("Apple", 5);

        bag.addItem(item1);
        bag.displayItems();
    }
}





// Encapsulation in Java is a core object-oriented programming concept that involves
// bundling data (variables) and the methods that operate on that data within a single unit, typically a class.

// It is a mechanism for achieving data hiding and protecting the internal
// state of an object from unauthorized or direct access from outside the class. 