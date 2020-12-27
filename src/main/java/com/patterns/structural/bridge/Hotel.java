package com.patterns.structural.bridge;

public class Hotel {

    private final Nationality nationality;
    private final String name;

    public Hotel(String name, Nationality nationality) {
        this.nationality = nationality;
        this.name = name;
    }

    public String getInfo(){
        return "Hotel name is " + name + " and his nationality " + nationality.getNationality();
    }
}
