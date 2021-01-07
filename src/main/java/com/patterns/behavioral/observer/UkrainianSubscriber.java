package com.patterns.behavioral.observer;

public class UkrainianSubscriber implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("UkrainianSubscriber :: " + m.getMessageContent());
    }
}
