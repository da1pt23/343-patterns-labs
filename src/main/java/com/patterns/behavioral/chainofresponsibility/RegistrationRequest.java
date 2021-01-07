package com.patterns.behavioral.chainofresponsibility;

public class RegistrationRequest {
    private final String nameOfHotel;
    private final String city;
    private final double averagePrice;

    public RegistrationRequest(String nameOfHotel, String city, double averagePrice) {
        this.nameOfHotel = nameOfHotel;
        this.city = city;
        this.averagePrice = averagePrice;
    }

    public String getNameOfHotel() {
        return nameOfHotel;
    }

    public String getCity() {
        return city;
    }

    public double getAveragePrice() {
        return averagePrice;
    }
}
