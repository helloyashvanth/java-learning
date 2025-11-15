package Java.Abstraction;

public class Main {
    public static void main(String[] args) {

        // Abstract Class
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.stop();

        // Interface
        Animal animal = new Dog();
        animal.sound();
    }
}





// Abstraction in Java is a core principle of OOP that focuses on showing only the
// essential details of an object or system while hiding the complex implementation details.

// Achieved through Abstract Classes and Interfaces:

// Abstract Classes:
// Classes that cannot be instantiated directly and may contain abstract methods (methods without a body)
// alongside concrete methods. Subclasses must provide implementations for the abstract methods.

// Interfaces:
// These define a contract for classes to implement, specifying a set of methods that a class must provide.
// Interfaces contain only abstract methods (implicitly public and abstract) and static final fields.