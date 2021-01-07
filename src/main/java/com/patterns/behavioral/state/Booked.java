package com.patterns.behavioral.state;

public class Booked implements RoomState {
    private static Booked instance = new Booked();

    private Booked() {
    }

    public static Booked instance() {
        return instance;
    }

    @Override
    public void updateState(RoomContext ctx) {
        System.out.println("hotel booked!!");
    }
}
