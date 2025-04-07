package com.airport.management.Airport;

public class AirportRunner {
    public static void main(String[] args) {
        AirPort airport = new AirPort();
        airport.setAirPortName("KIA");
        airport.setLocation("Bangalore");
        airport.setType("International");
        airport.setNoOfTerminals(2);
        airport.setState("Karnataka");

        String name = airport.getAirPortName();
        String location = airport.getLocation();
        String type = airport.getType();
        int terminals = airport.getNoOfTerminals();
        String state = airport.getState();

        System.out.println("name of the airport is : "+name);
        System.out.println("locatiom of the airport is :"+location);
        System.out.println("type of the airport is :"+type);
        System.out.println("no of terminals is :"+terminals);
        System.out.println("state of the airport is :"+state);

    }
}
