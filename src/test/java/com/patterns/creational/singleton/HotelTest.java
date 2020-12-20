package com.patterns.creational.singleton;

import com.patterns.creational.singleton.Hotel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    public void hotelTest(){
        Hotel fourSeasons = Hotel.getInstance(15);
        Hotel ukraine = Hotel.getInstance(10);

        assertEquals(fourSeasons.getRevenue(),ukraine.getRevenue());
    }

}