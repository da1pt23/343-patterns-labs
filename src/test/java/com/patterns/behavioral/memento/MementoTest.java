package com.patterns.behavioral.memento;

import org.junit.jupiter.api.Test;

public class MementoTest {

    @Test
    public void test() {
        Hotel hotel = new Hotel("Giselle");
        hotel.setPrice(20);
        System.out.println(hotel);

        HotelMemento memento = hotel.createMemento();

        hotel.setPrice(50);
        System.out.println(hotel);

        hotel.restore(memento);
        System.out.println(hotel);
    }
}