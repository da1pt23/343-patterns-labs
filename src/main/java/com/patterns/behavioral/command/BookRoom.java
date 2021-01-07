package com.patterns.behavioral.command;

public class BookRoom implements Operation {

    private final HotelRoom hotelRoom;

    public BookRoom(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }

    @Override
    public void execute() {
        System.out.println(hotelRoom + "was booked");
    }
}
