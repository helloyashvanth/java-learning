package Java.Abstraction;

public class Car extends Vehicle {

    @Override
    public void stop() {
        System.out.println("Car: Stopping");
    }
}