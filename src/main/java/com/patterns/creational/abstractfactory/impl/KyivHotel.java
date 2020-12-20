package com.patterns.creational.abstractfactory.impl;


import com.patterns.creational.abstractfactory.Hotel;

public class KyivHotel implements Hotel {

    @Override
    public String getDetails() {
        return "It's Kyiv hotel";
    }
}
