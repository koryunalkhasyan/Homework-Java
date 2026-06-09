package homework250526.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(10);

        List<Double> doubleList = new LinkedList<>();
        doubleList.add(2.5);
        doubleList.add(4.5);

        System.out.println("Integer List Sum: " + NumberUtils.sumOfList(intList));
        System.out.println("Double List Sum: " + NumberUtils.sumOfList(doubleList));


        List<City> cities = new ArrayList<>();
        cities.add(new City("Armenia", "Syunik", "Kapan"));
        cities.add(new City("Armenia", "Shirak", "Gyumri"));
        cities.add(new City("Georgia", "Tbilisi", "Tbilisi"));
        cities.add(new City("Armenia", "Syunik", "Goris"));

        System.out.println("\nՆախքան սորտավորելը:");
        cities.forEach(city -> System.out.println(city));

        Collections.sort(cities);

        System.out.println("\nՍորտավորումից հետո (Երկիր -> Մարզ -> Անուն):");
        cities.forEach(city -> System.out.println(city));

        City searchCity = new City("Armenia", "Syunik", "Goris");
        boolean exists = cities.contains(searchCity);

        System.out.println("\nԱրդյո՞ք Goris-ը կա ցուցակում: " + exists);
    }
}
