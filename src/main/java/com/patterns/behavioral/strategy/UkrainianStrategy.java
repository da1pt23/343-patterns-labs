package com.patterns.behavioral.strategy;

public class UkrainianStrategy implements CountryStrategy {

    public void subscribeToUpdates(String countryName) {
        System.out.println("subscribe to " + countryName + " updates");
    }
}
