package com.patterns.structural.facade;

public class HotelFacade {

    public String getUkrainianHotel(){
        return new UkrainianHotel().countryOfHotel();
    }

    public String getItalianHotel(){
        return new ItalianHotel().countryOfHotel();
    }
}
