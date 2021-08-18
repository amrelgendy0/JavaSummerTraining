package com.company.model;

public class Drug {
    String name;
    double price;
    String expireDate;
    int id;
    String type;

    public Drug(String name, double price, String expireDate, int id, String type) {
        this.name = name;
        this.price = price;
        this.expireDate = expireDate;
        this.id = id;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", expireDate='" + expireDate + '\'' +
                ", id=" + id +
                ", type='" + type + '\'' +
                '}';
    }

    public String values() {
        return name + price + expireDate + id + type;
    }
}
