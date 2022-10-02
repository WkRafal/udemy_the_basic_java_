import java.util.ArrayList;

public class Zoo <T extends Animal>{
    private ArrayList<T> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public void printAnimals() {
        for (T animal : animals) {
            System.out.println(animal);
        }
    }
}
