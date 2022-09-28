package com.exemple.oop.basic.interface_basics;

public class InterfaceExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        Vehicle vehicle = car;
        System.out.println(vehicle.getTopSpeed());

        Vehicle car2 = new Car();
        car2.turn();
        Car someCar = (Car) car2;
        System.out.println(someCar.getTopSpeed());

        Plane plane = new Plane();
        Vehicle planVehicle = plane;
        System.out.println(planVehicle.getTopSpeed());

        Vehicle vihicles[] = new Vehicle[3];
        vihicles[0] = car;
        vihicles[1] = car2;
        vihicles[2] = plane;

        vihicles[2].turn();

        if (vihicles[2] instanceof Plane){
            Plane samePlane = (Plane) vihicles[2];
            samePlane.stop();
        }

        Flying flyingVehicle = plane;
        flyingVehicle.decreaseHeight();
    }
}
