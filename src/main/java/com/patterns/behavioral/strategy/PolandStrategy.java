package com.patterns.behavioral.strategy;

public class PolandStrategy implements CountryStrategy {

    public void subscribeToUpdates(String countryName) {
        System.out.println("subscribe to " + countryName + " opera updates");
    }
}