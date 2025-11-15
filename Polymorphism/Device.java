package Java.Polymorphism;

public class Device {

    private String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String info() {
        return "Brand: " + brand;
    }
}