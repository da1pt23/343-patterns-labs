package com.patterns.creational.abstractfactory.factory;

import com.patterns.creational.abstractfactory.Hotel;

import java.util.Optional;

public abstract class CountryAbstractFactory {
    public abstract Optional<Hotel> getHotelByCity(String cityName) throws Exception;
}
