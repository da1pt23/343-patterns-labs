package com.patterns.structural.adapter;

public class Hostel implements BookHotel{

    @Override
    public String bookForMonth() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String bookForDay() {
        return "Booked a hostel";
    }
}
