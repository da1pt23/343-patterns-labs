package com.patterns.creational.abstractfactory.factory;

import com.patterns.creational.abstractfactory.Country;
import com.patterns.creational.abstractfactory.NoSuchCountryException;

import java.util.Optional;

public class HotelAbstractFactory {

  public static Optional<CountryAbstractFactory> getCountryAbstractFactory(String countryName){
        Optional<Country> country = Country.getCountryByName(countryName);

        if(country.isPresent()){
            switch (country.get()){
                case UKRAINE:
                    return Optional.of(new UkraineHotelAbstractFactory());
                case ITALY:
                    return Optional.of(new ItalyHotelCountryAbstractFactory());
            }
        } else {
            throw new NoSuchCountryException("Not found country name = " + countryName);
        }
        return Optional.empty();
    }

}
