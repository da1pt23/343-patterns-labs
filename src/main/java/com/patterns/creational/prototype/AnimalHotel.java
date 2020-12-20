package com.patterns.creational.prototype;

class AnimalHotel extends Hotel {

    public AnimalHotel() {
        super();
    }

    public AnimalHotel(AnimalHotel hotel) {
        super(hotel);
    }

    @Override
    public Hotel clone() {
        return new AnimalHotel(this);
    }
}
