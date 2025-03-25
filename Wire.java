package ConstructorChaining;

public class Wire {
    String brand;
    char type;
    int length;
    double resistance;
    boolean isCopper;
    long serialNumber;

    Wire() {
        this("ElectroWire");
    }

    Wire(String brand) {
        this('A');
        this.brand = brand;
    }

    Wire(char type) {
        this(50);
        this.type = type;
    }

    Wire(int length) {
        this(0.025);
        this.length = length;
    }

    Wire(double resistance) {
        this(true);
        this.resistance = resistance;
    }

    Wire(boolean isCopper) {
        this(9876543210123L);
        this.isCopper = isCopper;
    }

    Wire(long serialNumber) {
        this("PowerFlex", 0.05);
        this.serialNumber = serialNumber;
    }

    Wire(String brand, double resistance) {
        this.brand = brand;
        this.resistance = resistance;
    }

    public void displayInfo() {
        System.out.println("Wire Brand: " + brand);
        System.out.println("Wire Type: " + type);
        System.out.println("Wire Length: " + length + " meters");
        System.out.println("Wire Resistance: " + resistance + " ohms");
        System.out.println("Is Copper: " + isCopper);
        System.out.println("Serial Number: " + serialNumber);
    }

    public static void main(String[] args) {
        Wire ref1 = new Wire();
        ref1.displayInfo();
    }
}
