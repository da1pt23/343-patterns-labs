package com.patterns.behavioral.mediator;

public interface RoomWindow {
    void rentRoom(String msg, String userId);

    void addCustomer(Customer customer);
}
