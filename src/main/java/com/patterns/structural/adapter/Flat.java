package com.patterns.structural.adapter;

public class Flat implements BookHotel {

    @Override
    public String bookForMonth() {
        return "Booked a flat";
    }

    @Override
    public String bookForDay() {
        throw new UnsupportedOperationException();
    }
}
