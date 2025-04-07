package com.airport.management.Airport;

public class AirPort {
    private String airPortName;
    private String location;
    private String type;
    private int noOfTerminals;
    private String state;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAirPortName() {
        return airPortName;
    }

    public void setAirPortName(String airPortName) {
        this.airPortName = airPortName;
    }

    public int getNoOfTerminals() {
        return noOfTerminals;
    }

    public void setNoOfTerminals(int noOfTerminals) {
        this.noOfTerminals = noOfTerminals;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
