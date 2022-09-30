import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Animal> animals = new LinkedList<>();

        String anim[] = {"Dog","Cat","Tiger","Lion","Panda"};

        for (int i = 0; i < 20; i++) {
            int random = (int) Math.floor(Math.random() * 5);
            Animal animal = new Animal(anim[random]);
            animals.add(animal);
        }

        animals.removeFirst();
        animals.removeLast();
        animals.addFirst(new Animal(anim[2]));
        animals.addLast(new Animal(anim[3]));

        ListIterator<Animal> listIterator = animals.listIterator();
        while (listIterator.hasNext()) {
            Animal animal = listIterator.next();
            System.out.println(animal);
        }
    }
}
