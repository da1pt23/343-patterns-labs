package com.patterns.creational.factorymethod;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {

    @Test
    public void factoryMethodTest(){
        Optional<Hotel> hotel1 = HotelFactory.getHotel(HotelType.ANIMAL.getHotelType());
        Optional<Hotel> hotel2 = HotelFactory.getHotel(HotelType.HOSTEL.getHotelType());

        assertEquals("It's a animal hotel", hotel1.get().getDescription());
        assertEquals("It's a hostel", hotel2.get().getDescription());
    }

}