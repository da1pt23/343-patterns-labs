package com.patterns.creational.factorymethod;

import java.util.Optional;

public class HotelFactory {

    public static Optional<Hotel> getHotel(String hotelTypeName){
        Optional<HotelType> hotelType  = HotelType.getHotelTypeByName(hotelTypeName);

        if(hotelType.isPresent()){
            switch (hotelType.get()){
                case ANIMAL:
                    return Optional.of(new AnimalHotel());
                case HOSTEL:
                    return Optional.of(new HostelHotel());
            }
        }
        return Optional.empty();
    }
}
