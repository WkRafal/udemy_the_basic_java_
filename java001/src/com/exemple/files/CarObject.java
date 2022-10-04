package com.exemple.files;

import java.io.Serializable;

public class CarObject implements Serializable {
    public String manufacture;
    public String name;
    public int productionYear;
    public int topSpeed;
    public transient int id;

    public CarObject(String manufacture, String name, int productionYear, int topSpeed, int id) {
        this.manufacture = manufacture;
        this.name = name;
        this.productionYear = productionYear;
        this.topSpeed = topSpeed;
        this.id = id;


    }

    @Override
    public String toString() {
        return "CarObject{" +
                "manufacture='" + manufacture + '\'' +
                ", name='" + name + '\'' +
                ", productionYear=" + productionYear +
                ", topSpeed=" + topSpeed +
                ", id=" + id +
                '}';
    }
}
