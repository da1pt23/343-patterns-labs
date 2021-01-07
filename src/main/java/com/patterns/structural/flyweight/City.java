package com.patterns.structural.flyweight;

public class City {

    private String cityName;
    private Long population;

    public City(String cityName, Long population) {
        this.cityName = cityName;
        this.population = population;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }
}
