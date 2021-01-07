package com.patterns.behavioral.chainofresponsibility;

public interface Handler {
    void handleRequest(RegistrationRequest request);

    void setNext(Handler handler);
}
