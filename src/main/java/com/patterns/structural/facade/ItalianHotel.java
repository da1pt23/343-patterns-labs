package com.patterns.structural.facade;

public class ItalianHotel implements Hotel {
    @Override
    public String countryOfHotel() {
        return "italian";
    }
}
