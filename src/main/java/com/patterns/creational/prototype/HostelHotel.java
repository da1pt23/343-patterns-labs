package com.patterns.creational.prototype;

class HostelHotel extends Hotel {

    public HostelHotel(){
        super();
    }

    public HostelHotel(HostelHotel hotel) {
        super(hotel);
    }

    @Override
    public Hotel clone() {
        return new HostelHotel(this);
    }
}
