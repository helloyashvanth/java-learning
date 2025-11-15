package Java.Polymorphism;

public class Main {
    public static void main(String[] args) {

        // Method Overriding (Run-Time)
        Device device = new Device("Samsung");
        Mobile mobile = new Mobile("Samsung", "S24");

        System.out.println(device.info());
        System.out.println(mobile.info());

        // Method Overloading (Compile-Time)
        Math math = new Math();
        System.out.println(math.add(10, 10));
        System.out.println(math.add(10, 10, 10));
        System.out.println(math.add(11.5, 8.5));
    }
}





// Polymorphism in Java, a core concept of OOP, allows objects to take on multiple forms or behaviors.

// Types of Polymorphism:

// Compile-Time Polymorphism (Method Overloading):
// This occurs when multiple methods within the same class have the same name but different parameters (number, type, or order).
// The compiler determines which method to call based on the arguments provided during the method call.

// Run-Time Polymorphism (Method Overriding):
// This occurs when a subclass provides a specific implementation for a method that is already defined in its superclass.
// The method to be executed is determined at runtime based on the actual object type, not the reference type.