package com.patterns.behavioral.strategy;

public class ItalianStrategy implements CountryStrategy {

    public void subscribeToUpdates(String countryName) {
        System.out.println("subscribe to " + countryName + " updates");
    }
}