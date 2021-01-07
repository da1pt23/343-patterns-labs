package com.patterns.behavioral.mediator;

public class HotelCustomer extends Customer {

    public HotelCustomer(RoomWindow room, String id, String name) {
        super(room, id, name);
    }

    @Override
    public void buy(String msg, String userId) {
        System.out.println(this.getName() + " :: Rent room : " + msg + " for " + userId);
        getMediator().rentRoom(msg, userId);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.getName() + " :: Rented room : " + msg);
    }

}
