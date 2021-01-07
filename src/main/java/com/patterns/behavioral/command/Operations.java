package com.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Operations {

    private List<Operation> hotelRooms;

    public Operations() {
        this.hotelRooms = new ArrayList<>();
    }

    public void addOperation(Operation operation) {
        hotelRooms.add(operation);
    }

    public void showAllOrders() {
        hotelRooms.forEach(Operation :: execute);
    }

}
