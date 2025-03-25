
package ConstructorChaining;

public class Switch {
    String brand;
    char type;
    int voltage;
    double price;
    boolean isSmart;
    long modelNumber;

    Switch() {
        this("Philips");
    }

    Switch(String brand) {
        this('A');
        this.brand = brand;
    }

    Switch(char type) {
        this(220);
        this.type = type;
    }

    Switch(int voltage) {
        this(15.99);
        this.voltage = voltage;
    }

    Switch(double price) {
        this(true);
        this.price = price;
    }

    Switch(boolean isSmart) {
        this(1234567890123L);
        this.isSmart = isSmart;
    }

    Switch(long modelNumber) {
        this("Panasonic", 19.99);
        this.modelNumber = modelNumber;
    }

    Switch(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Switch Brand: " + brand);
        System.out.println("Switch Type: " + type);
        System.out.println("Voltage: " + voltage + "V");
        System.out.println("Price: $" + price);
        System.out.println("Is Smart: " + isSmart);
        System.out.println("Model Number: " + modelNumber);
    }

    public static void main(String[] args) {
        Switch ref1 = new Switch();
        ref1.displayInfo();
    }
}
