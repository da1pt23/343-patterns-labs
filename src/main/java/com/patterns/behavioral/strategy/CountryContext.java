package com.patterns.behavioral.strategy;

public class CountryContext {
    CountryStrategy strategy;

    public void setStrategy(CountryStrategy smStrategy) {
        this.strategy = smStrategy;
    }

    public void subscribe(String name) {
        strategy.subscribeToUpdates(name);
    }
}
