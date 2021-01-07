package com.patterns.behavioral.chainofresponsibility;

public class PriceHandler implements Handler {

    private Handler handler = null;

    @Override
    public void handleRequest(RegistrationRequest request) {
        if (request.getAveragePrice() > 100) {
            if (handler != null) {
                handler.handleRequest(request);
            } else {
                System.out.println("Registered");
            }
        } else {
            throw new IllegalArgumentException("Our service only for premium class hotels");
        }
    }

    @Override
    public void setNext(Handler handler) {
        this.handler = handler;
    }

}
