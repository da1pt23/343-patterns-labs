package com.patterns.creational.builder;

class Hotel {

    private String name;

    private String city;

    private String country;

    private double averagePrice;

    private Hotel(String name, String city, String country, double averagePrice) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.averagePrice = averagePrice;
    }

    public static Hotel.HotelBuilder builder() {
        return new Hotel.HotelBuilder();
    }

    public static class HotelBuilder {
        private String name;
        private String city;
        private String country;
        private double averagePrice;

        public HotelBuilder name(String name) {
            this.name = name;
            return this;
        }

        public HotelBuilder city(String city) {
            this.city = city;
            return this;
        }

        public HotelBuilder country(String country) {
            this.country = country;
            return this;
        }

        public HotelBuilder averagePrice(double averagePrice) {
            this.averagePrice = averagePrice;
            return this;
        }

        public Hotel build() {
            return new Hotel(name, city, country, averagePrice);
        }
    }


    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public double getAveragePrice() {
        return averagePrice;
    }
}
