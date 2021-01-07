package com.patterns.behavioral.memento;

public class Hotel {
    private String hotelName;
    private Integer price;

    public Hotel(String title) {
        this.hotelName = title;
    }

    public HotelMemento createMemento() {
        return new HotelMemento(hotelName, price);
    }

    public void restore(HotelMemento m) {
        this.hotelName = m.getTitle();
        this.price = m.getPrice();
    }

    public String getHotelName() {
        return hotelName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "title='" + hotelName + '\'' +
                ", price=" + price +
                '}';
    }
}
