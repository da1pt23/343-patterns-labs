package com.patterns.behavioral.command;

public class HotelRoom {
    private String hotelName;
    private String roomNumber;

    public HotelRoom(String hotelName, String roomNumber) {
        this.hotelName = hotelName;
        this.roomNumber = roomNumber;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                "hotelName='" + hotelName + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                '}';
    }
}
