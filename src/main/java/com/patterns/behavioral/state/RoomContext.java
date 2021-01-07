package com.patterns.behavioral.state;

public class RoomContext {

    private RoomState currentState;
    private String roomId;

    public RoomContext(RoomState currentState, String roomId) {
        super();
        this.currentState = currentState;
        this.roomId = roomId;

        if (currentState == null) {
            this.currentState = Accepted.instance();
        }
    }

    public RoomState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(RoomState currentState) {
        this.currentState = currentState;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public void update() {
        currentState.updateState(this);
    }
}
