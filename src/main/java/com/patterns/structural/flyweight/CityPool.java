package com.patterns.structural.flyweight;


import java.util.HashMap;
import java.util.Map;

public class CityPool {

    private final static Map<String, City> cities = new HashMap<>();

    public void addCity(String cityName, Long cityPopulation){
        cities.put(cityName, new City(cityName, cityPopulation));
    }

    public static City getCityByName(String cityName){
        return cities.get(cityName);
    }
}
