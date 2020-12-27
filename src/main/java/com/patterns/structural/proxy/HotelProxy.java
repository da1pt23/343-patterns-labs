package com.patterns.structural.proxy;

public class HotelProxy {

    private final Hotel hotel;
    private long descriptionShowed = 0;

    public HotelProxy(String hotelName) {
        this.hotel = new AnimalHotel(hotelName);
    }

    public String getName(){
        System.out.println("-------- Info was called " + ++descriptionShowed + " times --------");
        return hotel.getName();
    }


    public long getDescriptionShowed() {
        return descriptionShowed;
    }
}
