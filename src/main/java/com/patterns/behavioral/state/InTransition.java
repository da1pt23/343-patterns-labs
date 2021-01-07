package com.patterns.behavioral.state;

public class InTransition implements RoomState {
    private static InTransition instance = new InTransition();

    private InTransition() {
    }

    public static InTransition instance() {
        return instance;
    }

    @Override
    public void updateState(RoomContext ctx) {
        System.out.println("room booking is in transition !!");
        ctx.setCurrentState(Booked.instance());
    }
}
