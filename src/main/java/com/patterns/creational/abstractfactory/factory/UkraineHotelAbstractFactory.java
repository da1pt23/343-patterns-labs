package com.patterns.creational.abstractfactory.factory;

import com.patterns.creational.abstractfactory.City;
import com.patterns.creational.abstractfactory.Hotel;
import com.patterns.creational.abstractfactory.impl.KharkivHotel;
import com.patterns.creational.abstractfactory.impl.KyivHotel;

import java.util.Optional;

public class UkraineHotelAbstractFactory extends CountryAbstractFactory {

    @Override
    public Optional<Hotel> getHotelByCity(String cityName) throws Exception {
        Optional<City> city = City.getCityByName(cityName);
        if (city.isPresent()){
            switch (city.get()){
                case KYIV:
                    return Optional.of(new KyivHotel());
                case KHARKIV:
                    return Optional.of(new KharkivHotel());
                default:
                    throw new Exception("It's not Ukrainian city = " + cityName);
            }
        } else {
            return Optional.empty();
        }
    }

}
