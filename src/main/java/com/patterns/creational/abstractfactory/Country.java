package com.patterns.creational.abstractfactory;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public enum Country {
    UKRAINE("Ukraine"),
    ITALY("Italy");

    private final String countryName;

    Country(String countryName) {
        this.countryName = countryName;
    }

    public static Optional<Country> getCountryByName(String countryName){
        return Arrays.stream(Country.values())
                .filter(x -> Objects.equals(countryName,x.getCountryName()))
                .findAny();
    }

    public String getCountryName() {
        return countryName;
    }
}
