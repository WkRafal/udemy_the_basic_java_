package org.example.oneToOne.model;

import jakarta.persistence.*;

@Entity
@Table(name = "parcels")
public class Parcel {

    public Parcel() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    private ParcelAddress parcelAddress;

    private String wereHouse;
    private int price;

    public Parcel(String wereHouse, int price) {
        this.wereHouse = wereHouse;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ParcelAddress getParcelAddress() {
        return parcelAddress;
    }

    public void setParcelAddress(ParcelAddress parcelAddress) {
        this.parcelAddress = parcelAddress;
    }

    public String getWereHouse() {
        return wereHouse;
    }

    public void setWereHouse(String wereHouse) {
        this.wereHouse = wereHouse;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "id=" + id +
                ", parcelAddress=" + parcelAddress +
                ", wereHouse='" + wereHouse + '\'' +
                ", price=" + price +
                '}';
    }
}
