package com.patterns.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HotelAdapterTest {

    @Test
    public void book(){
        HotelAdapter hotelAdapter = new HotelAdapter();
        assertEquals("Booked a flat", hotelAdapter.book(HotelType.FLAT));
        assertEquals("Booked a hostel", hotelAdapter.book(HotelType.HOSTEL));
    }

}