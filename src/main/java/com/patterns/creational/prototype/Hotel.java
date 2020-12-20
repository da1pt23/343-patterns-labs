package com.patterns.creational.prototype;

import lombok.Data;

@Data
abstract class Hotel {

    private String name;

    private double averagePrice;

    public Hotel() {
    }

    public Hotel(Hotel hotel) {
        this.name = hotel.name;
        this.averagePrice = hotel.averagePrice;
    }

    abstract public Hotel clone();
}
