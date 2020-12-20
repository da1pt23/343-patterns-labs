package com.patterns.creational.singleton;

import java.util.Objects;

class Hotel {

    private static volatile Hotel hotel = null;

    private int revenue;

    private Hotel(int revenue) {
        this.revenue = revenue;
    }

    public static Hotel getInstance(int revenue){
        if(Objects.isNull(hotel)){
            synchronized (Hotel.class){
                if(Objects.isNull(hotel)){
                    hotel = new Hotel(revenue);
                }
            }
        }
        return hotel;
    }

    public int getRevenue() {
        return revenue;
    }

}