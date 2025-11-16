package Java.ComparableComparator;

public class Comparatorperson {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Comparatorperson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Comparatorperson() {

    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}