import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Ola");
        names.add("Kasia");
        names.add("Daniel");
        names.add("Ola");
        names.add("Kasia");
        names.add("Adam");

        for (String name : names) {
            System.out.println(name);
        }

        HashSet<Car> cars = new HashSet<>();
        Car car1 = new Car("Merc");
        cars.add(car1);
        cars.add(car1);
        Car car2 = new Car("Audi");
        cars.add(car2);
        cars.add(car2);
        Car car3 = new Car("Kia");
        cars.add(car3);
        cars.add(car3);

        Iterator<Car> i = cars.iterator();
        while (i.hasNext()) {
            Car car = i.next();
            System.out.println(car);
        }
    }
}
