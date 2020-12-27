package com.patterns.structural.composite;

public class HostelHotel implements Hotel {

    private final String name;

    public HostelHotel(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
