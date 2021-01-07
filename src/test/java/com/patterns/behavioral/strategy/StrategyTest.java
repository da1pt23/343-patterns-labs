package com.patterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    public void test() {
        CountryContext context = new CountryContext();

        context.setStrategy(new UkrainianStrategy());
        context.subscribe("Ivan Ivanov");


        context.setStrategy(new ItalianStrategy());
        context.subscribe("Ivan Ivanov");


        context.setStrategy(new PolandStrategy());
        context.subscribe("Ivan Ivanov");
    }

}