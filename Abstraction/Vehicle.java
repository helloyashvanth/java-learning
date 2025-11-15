package Java.Abstraction;

public abstract class Vehicle {

    public void start() {
        System.out.println("Vehicle: Starting");
    }

    abstract void stop();
}