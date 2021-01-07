package com.patterns.structural.flyweight;


public class Hotel {

    private final City city;

    public Hotel(String cityName) {
        this.city = CityPool.getCityByName(cityName);
    }

    public City getCity() {
        return city;
    }
}
