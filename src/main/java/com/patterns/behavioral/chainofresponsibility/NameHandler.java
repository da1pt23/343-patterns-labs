package com.patterns.behavioral.chainofresponsibility;

public class NameHandler implements Handler {

    private Handler handler = null;

    @Override
    public void handleRequest(RegistrationRequest request) {
        if (request.getNameOfHotel().contains("Hotel")) {
            if (handler != null) {
                handler.handleRequest(request);
            } else {
                System.out.println("Registered");
            }
        } else {
            throw new IllegalArgumentException("Name must contain \"Hotel\"");
        }
    }

    @Override
    public void setNext(Handler handler) {
        this.handler = handler;
    }

}
