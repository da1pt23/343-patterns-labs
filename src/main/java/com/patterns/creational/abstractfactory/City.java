package com.patterns.creational.abstractfactory;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public enum City {
    //Ukraine
    KYIV("Kyiv"),
    KHARKIV("Kharkiv"),

    //Italy
    ROME("Rome"),
    VERONA("Verona");

    private String cityName;

    City(String cityName) {
        this.cityName = cityName;
    }

    public static Optional<City> getCityByName(String cityName) {
        return Arrays.stream(City.values())
                .filter(x -> Objects.equals(cityName, x.getCityName()))
                .findAny();
    }

    public String getCityName() {
        return cityName;
    }
}
