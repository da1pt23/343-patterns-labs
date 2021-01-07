package com.patterns.behavioral.template;

public abstract class HotelBookingService {

    public final void bookHotel() {
        printWebSite();
        printCountry();
    }

    public abstract void printCountry();

    private final void printWebSite() {
        System.out.println("hotels.com");
    }
}