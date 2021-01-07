package com.patterns.behavioral.mediator;

public abstract class Customer {
    private RoomWindow mediator;

    private String id;
    private String name;

    public Customer(RoomWindow roomWindow, String id, String name) {
        this.mediator = roomWindow;
        this.name = name;
        this.id = id;
    }

    public abstract void buy(String msg, String userId);

    public abstract void receive(String msg);

    public RoomWindow getMediator() {
        return mediator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
