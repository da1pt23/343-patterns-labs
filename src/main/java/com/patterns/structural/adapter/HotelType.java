package com.patterns.structural.adapter;

public enum  HotelType {
    HOSTEL("Hostel"),
    FLAT("Flat");

    private final String type;

    HotelType(String type) {
        this.type = type;
    }
}
