package com.patterns.behavioral.state;

public class Accepted implements RoomState {
    private static Accepted instance = new Accepted();

    private Accepted() {
    }

    public static Accepted instance() {
        return instance;
    }

    @Override
    public void updateState(RoomContext ctx) {
        System.out.println("room order is accepted !!");
        ctx.setCurrentState(InTransition.instance());
    }
}
