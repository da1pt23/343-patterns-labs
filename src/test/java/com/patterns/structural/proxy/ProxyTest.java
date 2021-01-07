package com.patterns.structural.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ProxyTest {

    @Test
    public void proxyTest(){
        HotelProxy proxy = new HotelProxy("Four Seasons");
        assertEquals("Four Seasons", proxy.getName());
        proxy.getName();
        assertEquals(2L, proxy.getDescriptionShowed());
    }


}