package ConstructorChaining;

public class Metro {
    String city;
    char lineCode;
    int numberOfStations;
    double fare;
    boolean isOperational;
    long dailyPassengers;

    Metro() {
        this("New York");
    }

    Metro(String city) {
        this('A');
        this.city = city;
    }

    Metro(char lineCode) {
        this(50);
        this.lineCode = lineCode;
    }

    Metro(int numberOfStations) {
        this(2.75);
        this.numberOfStations = numberOfStations;
    }

    Metro(double fare) {
        this(true);
        this.fare = fare;
    }

    Metro(boolean isOperational) {
        this(5000000L);
        this.isOperational = isOperational;
    }

    Metro(long dailyPassengers) {
        this("London", 3.50);
        this.dailyPassengers = dailyPassengers;
    }

    Metro(String city, double fare) {
        this.city = city;
        this.fare = fare;
    }

    public void displayInfo() {
        System.out.println("Metro City: " + city);
        System.out.println("Metro Line Code: " + lineCode);
        System.out.println("Number of Stations: " + numberOfStations);
        System.out.println("Metro Fare: $" + fare);
        System.out.println("Is Operational: " + isOperational);
        System.out.println("Daily Passengers: " + dailyPassengers);
    }

    public static void main(String[] args) {
        Metro ref1 = new Metro();
        ref1.displayInfo();
    }
}
