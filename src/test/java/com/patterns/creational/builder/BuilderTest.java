package com.patterns.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuilderTest {

    @Test
    public void builderTest(){
        Hotel hotel = Hotel.builder()
                .name("FourSeasons")
                .averagePrice(123.0)
                .city("London")
                .country("UK")
                .build();
        assertEquals("FourSeasons",hotel.getName());
        assertEquals(123.0, hotel.getAveragePrice());
        assertEquals("London", hotel.getCity());
        assertEquals("UK", hotel.getCountry());
    }

}