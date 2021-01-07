package com.patterns.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class RoomWindowImpl implements RoomWindow {

    private Map<String, Customer> customerMap = new HashMap<>();

    @Override
    public void rentRoom(String msg, String userId) {
        Customer customer = customerMap.get(userId);
        customer.receive(msg);
    }

    @Override
    public void addCustomer(Customer customer) {
        this.customerMap.put(customer.getId(), customer);
    }
}
