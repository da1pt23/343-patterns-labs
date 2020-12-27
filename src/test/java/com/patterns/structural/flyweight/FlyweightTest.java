package com.patterns.structural.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlyweightTest {

    @Test
    public void flyweightTest() {
        CityPool cityPool = new CityPool();
        cityPool.addCity("Verona", 400000L);
        cityPool.addCity("Chernivtsi", 250000L);

        Hotel hotel = new Hotel("Verona");
        Hotel hotel1 = new Hotel("Chernivtsi");

        assertEquals("Verona", hotel.getCity().getCityName());
        assertEquals(400000L, hotel.getCity().getPopulation());

        assertEquals("Chernivtsi", hotel1.getCity().getCityName());
        assertEquals(250000L, hotel1.getCity().getPopulation());
    }

}