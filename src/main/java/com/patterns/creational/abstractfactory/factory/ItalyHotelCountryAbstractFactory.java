package com.patterns.creational.abstractfactory.factory;

import com.patterns.creational.abstractfactory.City;
import com.patterns.creational.abstractfactory.Hotel;
import com.patterns.creational.abstractfactory.impl.RomeHotel;
import com.patterns.creational.abstractfactory.impl.VeronaHotel;

import java.util.Optional;

public class ItalyHotelCountryAbstractFactory extends CountryAbstractFactory {

    @Override
    public Optional<Hotel> getHotelByCity(String cityName) throws Exception {
        Optional<City> city = City.getCityByName(cityName);
        if (city.isPresent()){
            switch (city.get()){
                case ROME:
                    return Optional.of(new RomeHotel());
                case VERONA:
                    return Optional.of(new VeronaHotel());
                default:
                    throw new Exception("It's not Italy city = " + cityName);
            }
        } else {
            return Optional.empty();
        }
    }
}
