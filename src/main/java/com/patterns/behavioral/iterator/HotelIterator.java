package com.patterns.behavioral.iterator;

public class HotelIterator implements Iterator<Hotel> {

    private Hotel[] hotels;
    private int position;

    public HotelIterator(Hotel[] hotels) {
        this.hotels = hotels;
        position = 0;
    }

    @Override
    public void reset() {
        position = 0;
    }

    @Override
    public Hotel next() {
        return hotels[position++];
    }

    @Override
    public Hotel current() {
        return hotels[position];
    }

    @Override
    public boolean hasNext() {
        if (position >= hotels.length) {
            return false;
        }
        return true;
    }
}
