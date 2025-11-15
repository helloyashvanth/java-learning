package Java.Polymorphism;

public class Mobile extends Device {

    private String model;

    public Mobile(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String info() {
        return "Brand: " + getBrand() + ", Model: " + model;
    }
}
