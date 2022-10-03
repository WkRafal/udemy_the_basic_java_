public class Main {
    public static void main(String[] args) {
        Zoo<Animal> zoo = new Zoo<>();
        zoo.addAnimal(new Tiger("tiger",3));
        zoo.addAnimal(new Animal("Kot",12));
        zoo.addAnimal(new Lion("Lion",5));

        zoo.printAnimals();

    }
}
