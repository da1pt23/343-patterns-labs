package com.patterns.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class PrototypeTest {

    @Test
    public void prototypeTest(){

        Hotel hostelHotel = new HostelHotel();
        hostelHotel.setName("U_HOME");
        hostelHotel.setAveragePrice(14.0);

        Hotel animalHotel = new AnimalHotel();
        animalHotel.setName("ANIMAL_HOME");
        animalHotel.setAveragePrice(15.0);

        Hotel animalHotel1 = animalHotel.clone();

        Hotel hostelHotel1 = hostelHotel.clone();

        assertNotSame(hostelHotel, hostelHotel1);
        assertNotSame(animalHotel, animalHotel1);
        assertEquals(hostelHotel.getAveragePrice(), hostelHotel1.getAveragePrice());
        assertEquals(animalHotel.getAveragePrice(), animalHotel1.getAveragePrice());
    }
}