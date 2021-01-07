package com.patterns.behavioral.memento;

public final class HotelMemento {
    private final String title;
    private final Integer price;

    public HotelMemento(String title, Integer price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPrice() {
        return price;
    }
}