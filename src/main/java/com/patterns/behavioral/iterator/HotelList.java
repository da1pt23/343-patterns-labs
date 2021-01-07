package com.patterns.behavioral.iterator;

public class HotelList implements List<Hotel> {
    private Hotel[] hotels;

    public HotelList(Hotel[] hotels) {
        this.hotels = hotels;
    }

    @Override
    public Iterator<Hotel> iterator() {
        return new HotelIterator(hotels);
    }
}
