package Java.ComparableComparator;

public class Comparableperson implements Comparable<Comparableperson> {
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

    public Comparableperson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Comparableperson() {

    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    @Override
    public int compareTo(Comparableperson p) {
        return this.age - p.age;
    }

    // @Override
    // public int compareTo(Comparableperson p) {
    //     return this.name.compareTo(p.name);
    // }
}