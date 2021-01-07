package com.patterns.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BridgeTest {

    @Test
    public void bridgeTest(){
        Hotel hotel = new Hotel("Four seasons", new UkrainianNationality());
        assertEquals("Hotel name is Four seasons and his nationality ukrainian", hotel.getInfo());
    }

}