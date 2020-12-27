package com.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CityHotels {
    List<Hotel> hotels = new ArrayList<>();

    public List<String> getHotelsName() {
        return hotels.stream()
                     .map(Hotel :: getName)
                     .collect(Collectors.toList());
    }

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }
}
