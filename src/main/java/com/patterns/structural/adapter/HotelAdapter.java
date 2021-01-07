package com.patterns.structural.adapter;

public class HotelAdapter {

    public String book(HotelType hotelType) {
        switch (hotelType) {
            case FLAT:
                return new Flat().bookForMonth();
            case HOSTEL:
                return new Hostel().bookForDay();
            default:
                throw new UnsupportedOperationException();
        }
    }

}
