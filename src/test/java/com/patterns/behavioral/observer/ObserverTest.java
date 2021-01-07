package com.patterns.behavioral.observer;

import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    public void test() {
        PolishSubscriber s1 = new PolishSubscriber();
        UkrainianSubscriber s2 = new UkrainianSubscriber();
        ItalianSubscriber s3 = new ItalianSubscriber();

        Publisher p = new Publisher();

        p.attach(s3);

        p.notifyUpdate(new Message("new hotel opening in rome"));

        p.detach(s3);
        p.attach(s2);

        p.notifyUpdate(new Message("new hotel opening in odessa "));
    }

}