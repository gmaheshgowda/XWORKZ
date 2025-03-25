package ConstructorChaining;

public class House {
    String ownerName;
    char houseType;
    int numberOfRooms;
    double area;
    boolean hasGarage;
    long houseNumber;

    House() {
        this("John Doe");
    }

    House(String ownerName) {
        this('A');
        this.ownerName = ownerName;
    }

    House(char houseType) {
        this(4);
        this.houseType = houseType;
    }

    House(int numberOfRooms) {
        this(2500.75);
        this.numberOfRooms = numberOfRooms;
    }

    House(double area) {
        this(true);
        this.area = area;
    }

    House(boolean hasGarage) {
        this(1023456789L);
        this.hasGarage = hasGarage;
    }

    House(long houseNumber) {
        this("Smith Family", 1800.50);
        this.houseNumber = houseNumber;
    }

    House(String ownerName, double area) {
        this.ownerName = ownerName;
        this.area = area;
    }

    public void displayInfo() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("House Type: " + houseType);
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("House Area: " + area + " sq.ft");
        System.out.println("Has Garage: " + hasGarage);
        System.out.println("House Number: " + houseNumber);
    }

    public static void main(String[] args) {
        House ref1 = new House();
        ref1.displayInfo();
    }
}

