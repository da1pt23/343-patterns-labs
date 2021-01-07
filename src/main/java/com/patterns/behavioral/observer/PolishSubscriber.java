package com.patterns.behavioral.observer;

public class PolishSubscriber implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("PolishSubscriber :: " + m.getMessageContent());
    }
}
