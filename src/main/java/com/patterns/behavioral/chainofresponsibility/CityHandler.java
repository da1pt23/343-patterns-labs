package com.patterns.behavioral.chainofresponsibility;

public class CityHandler implements Handler {

    private Handler handler = null;

    @Override
    public void handleRequest(RegistrationRequest request) {
        if (City.getCityByName(request.getCity()).isPresent()) {
            if (handler != null) {
                handler.handleRequest(request);
            } else {
                System.out.println("Registered");
            }
        } else {
            throw new IllegalArgumentException("Unknown city");
        }
    }

    @Override
    public void setNext(Handler handler) {
        this.handler = handler;
    }
}
