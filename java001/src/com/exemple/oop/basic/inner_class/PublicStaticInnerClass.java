package com.exemple.oop.basic.inner_class;

class CarObj {
    private String modelName;
    private String manufacture;
    private int year;

    public static class CarObjBuilder {
        private CarObj car = new CarObj();

        public CarObjBuilder setModelName(String modelName) {
            car.modelName = modelName;
            return this;
        }

        public CarObjBuilder setManufactrure(String manufacture) {
            car.manufacture = manufacture;
            return this;
        }

        public CarObjBuilder setYear(int year) {
            car.year = year;
            return this;
        }

        public CarObj getCar() {
            return this.car;
        }
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "CarObj{" +
                "modelName='" + modelName + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", year=" + year +
                '}';
    }
}

public class PublicStaticInnerClass {
    public static void main(String[] args) {

        CarObj car = new CarObj.CarObjBuilder()
                .setModelName("T")
                .setManufactrure("Ford")
                .setYear(1920)
                .getCar();

        System.out.println(car.getModelName());
        System.out.println(car);
    }
}
