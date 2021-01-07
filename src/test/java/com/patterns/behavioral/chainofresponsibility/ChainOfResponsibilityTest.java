package com.patterns.behavioral.chainofresponsibility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChainOfResponsibilityTest {

    @Test
    public void happyPathTest() {
        CityHandler cityHandler = new CityHandler();
        NameHandler nameHandler = new NameHandler();
        PriceHandler priceHandler = new PriceHandler();

        cityHandler.setNext(nameHandler);
        nameHandler.setNext(priceHandler);

        RegistrationRequest request = new RegistrationRequest("Four Seasons Hotel", "Milan", 120.);
        cityHandler.handleRequest(request);
    }

    @Test
    public void failPathTest_V1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            CityHandler cityHandler = new CityHandler();
            NameHandler nameHandler = new NameHandler();
            PriceHandler priceHandler = new PriceHandler();

            cityHandler.setNext(nameHandler);
            nameHandler.setNext(priceHandler);

            RegistrationRequest request = new RegistrationRequest("Four Seasons", "Milan", 120.);
            cityHandler.handleRequest(request);
        });
    }

    @Test
    public void failPathTest_V2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            CityHandler cityHandler = new CityHandler();
            NameHandler nameHandler = new NameHandler();
            PriceHandler priceHandler = new PriceHandler();

            cityHandler.setNext(nameHandler);
            nameHandler.setNext(priceHandler);

            RegistrationRequest request = new RegistrationRequest("Four Seasons Hotel", "Moscow", 120.);
            cityHandler.handleRequest(request);
        });
    }


    @Test
    public void failPathTest_V3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            CityHandler cityHandler = new CityHandler();
            NameHandler nameHandler = new NameHandler();
            PriceHandler priceHandler = new PriceHandler();

            cityHandler.setNext(nameHandler);
            nameHandler.setNext(priceHandler);

            RegistrationRequest request = new RegistrationRequest("Four Seasons Hotel", "Milan", 60.);
            cityHandler.handleRequest(request);
        });
    }

}