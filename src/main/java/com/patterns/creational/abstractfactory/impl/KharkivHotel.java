package com.patterns.creational.abstractfactory.impl;

import com.patterns.creational.abstractfactory.Hotel;

public class KharkivHotel implements Hotel {

    @Override
    public String getDetails() {
        return "It's Kharkiv hotel";
    }
}
