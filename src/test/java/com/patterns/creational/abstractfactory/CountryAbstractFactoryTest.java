package com.patterns.creational.abstractfactory;

import com.patterns.creational.abstractfactory.factory.CountryAbstractFactory;
import com.patterns.creational.abstractfactory.factory.HotelAbstractFactory;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CountryAbstractFactoryTest {

    @Test
    void getDetails() throws Exception {
        Optional<CountryAbstractFactory> italyHotelAbstractFactory = HotelAbstractFactory.getCountryAbstractFactory("Italy");
        assertTrue(italyHotelAbstractFactory.isPresent());

        Optional<Hotel> romeHotel = italyHotelAbstractFactory.get().getHotelByCity("Rome");
        assertTrue(romeHotel.isPresent());

        assertEquals("It's Rome hotel", romeHotel.get().getDetails());

        Optional<Hotel> veronaHotel = italyHotelAbstractFactory.get().getHotelByCity("Verona");
        assertTrue(veronaHotel.isPresent());

        assertEquals("It's Verona hotel", veronaHotel.get().getDetails());

        Optional<CountryAbstractFactory> ukraineHotelAbstractFactory = HotelAbstractFactory.getCountryAbstractFactory("Ukraine");
        assertTrue(ukraineHotelAbstractFactory.isPresent());

        Optional<Hotel> kyivHotel = ukraineHotelAbstractFactory.get().getHotelByCity("Kyiv");
        assertTrue(kyivHotel.isPresent());

        assertEquals("It's Kyiv hotel", kyivHotel.get().getDetails());

        Optional<Hotel> kharkivHotel = ukraineHotelAbstractFactory.get().getHotelByCity("Kharkiv");
        assertTrue(kharkivHotel.isPresent());

        assertEquals("It's Kharkiv hotel", kharkivHotel.get().getDetails());


    }
}