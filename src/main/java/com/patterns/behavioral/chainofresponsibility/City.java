package com.patterns.behavioral.chainofresponsibility;

import java.util.Arrays;
import java.util.Optional;

public enum City {
    MILAN,
    PARIS,
    LONDON,
    MADRID;

    public static Optional<City> getCityByName(String name) {
        return Arrays.stream(City.values())
                     .filter(x -> x.toString().equals(name.toUpperCase()))
                     .findAny();
    }
}
