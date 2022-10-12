package org.example.lombok.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String manufacturer;
    private String name;
    private int topSpeed;

    public Car(String manufacturer, String name, int topSpeed) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.topSpeed = topSpeed;
    }

    public String odjStrData() {
        return "Car: " + getManufacturer() +
                " " + getName() +
                " " + getTopSpeed();
    }
}
