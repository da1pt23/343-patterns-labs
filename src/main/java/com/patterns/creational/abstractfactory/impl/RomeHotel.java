package com.patterns.creational.abstractfactory.impl;

import com.patterns.creational.abstractfactory.Hotel;

public class RomeHotel implements Hotel {

    @Override
    public String getDetails() {
        return "It's Rome hotel";
    }
}
