package com.patterns.behavioral.observer;

public class ItalianSubscriber implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("ItalianSubscriber :: " + m.getMessageContent());
    }
}
