package com.patterns.behavioral.command;

public class CleanRoom implements Operation {

    private final HotelRoom hotelRoom;

    public CleanRoom(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }

    @Override
    public void execute() {
        System.out.println(hotelRoom + "was cleaned");
    }
}
