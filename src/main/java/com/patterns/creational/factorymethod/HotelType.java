package com.patterns.creational.factorymethod;

import com.patterns.creational.abstractfactory.City;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public enum HotelType {
    ANIMAL("Animal hotel"),
    HOSTEL("Hostel hotel");

    private final String hotelType;

    HotelType(String hotelType) {
        this.hotelType = hotelType;
   }

    public static Optional<HotelType> getHotelTypeByName(String hotelType) {
        return Arrays.stream(HotelType.values())
                .filter(x -> Objects.equals(hotelType, x.getHotelType()))
                .findAny();
    }

    public String getHotelType() {
        return hotelType;
    }
}
