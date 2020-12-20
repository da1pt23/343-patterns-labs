package com.patterns.creational.abstractfactory;

public class NoSuchCountryException extends RuntimeException {

    public NoSuchCountryException(String message) {
        super(message);
    }

    public NoSuchCountryException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchCountryException(Throwable cause) {
        super(cause);
    }
}
