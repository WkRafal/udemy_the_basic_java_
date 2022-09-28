public class CarFactory {

    public Car buildCar() {
        String colors[] = {"czerwony", "czarny", "biały"};
        int index = (int) Math.floor(Math.random() * colors.length);
        Car car = new Car("Ford", "Mustang", colors[index]);
        return car;
    }
}
