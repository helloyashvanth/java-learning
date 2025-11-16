package Java.ComparableComparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("USING COMPARATOR \n");

        List<Comparatorperson> comparatorPersons = new ArrayList<Comparatorperson>();

        comparatorPersons.add(new Comparatorperson("Yashvanth", 21));
        comparatorPersons.add(new Comparatorperson("Prathipa", 20));
        comparatorPersons.add(new Comparatorperson("Prathvanth", 22));
        comparatorPersons.add(new Comparatorperson("Prathyash", 19));

        System.out.println("Without Sorting");
        displayComparator(comparatorPersons);

        System.out.println();

        System.out.println("With Sorting");

        System.out.println("Sorting By Name: ");
        comparatorPersons.sort((a, b) -> a.getName().compareTo(b.getName()));
        displayComparator(comparatorPersons);

        System.out.println();

        System.out.println("Sorting By Age: ");
        comparatorPersons.sort((a, b) -> a.getAge() - b.getAge());
        displayComparator(comparatorPersons);



        System.out.println();



        System.out.println("USING COMPARABLE \n");
        
        List<Comparableperson> comparablepersons = new ArrayList<Comparableperson>();
        
        comparablepersons.add(new Comparableperson("Albert", 10));
        comparablepersons.add(new Comparableperson("Yuki", 5));
        comparablepersons.add(new Comparableperson("Bheema", 15));
        comparablepersons.add(new Comparableperson("Charles", 30));
        
        System.out.println("Without Sorting");
        displayComparable(comparablepersons);

        System.out.println();

        System.out.println("With Sorting");

        System.out.println("Sorting By Age: ");
        comparablepersons.sort(null);
        displayComparable(comparablepersons);

    }

    static void displayComparator(List<Comparatorperson> persons) {
        for (Comparatorperson p : persons) {
            System.out.println(p.toString());
        }
    }

    static void displayComparable(List<Comparableperson> persons) {
        for (Comparableperson p : persons) {
            System.out.println(p.toString());
        }
    }
}
