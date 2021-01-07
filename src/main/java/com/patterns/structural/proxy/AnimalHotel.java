package com.patterns.structural.proxy;

public class AnimalHotel implements Hotel {

    private final String name;

    public AnimalHotel(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
