package com.patterns.behavioral.command;

import org.junit.jupiter.api.Test;

public class CommandTest {

    @Test
    public void test() {
        HotelRoom hotelRoom = new HotelRoom("name", "3d");
        BookRoom bookRoom = new BookRoom(hotelRoom);
        CleanRoom cleanRoom = new CleanRoom(hotelRoom);

        Operations operations = new Operations();
        operations.addOperation(bookRoom);
        operations.addOperation(cleanRoom);

        operations.showAllOrders();
    }

}