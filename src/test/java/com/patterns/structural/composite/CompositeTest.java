package com.patterns.structural.composite;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompositeTest {

    @Test
    public void compositeTest(){
        CityHotels cityHotels = new CityHotels();
        cityHotels.addHotel(new AnimalHotel("pets"));
        cityHotels.addHotel(new AnimalHotel("pets1"));
        cityHotels.addHotel(new HostelHotel("hostel"));

        List<String> expected = cityHotels.getHotelsName();
        assertEquals("pets", expected.get(0));
        assertEquals("pets1", expected.get(1));
        assertEquals("hostel", expected.get(2));
    }

}