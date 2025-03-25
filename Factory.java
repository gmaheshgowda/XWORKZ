package ConstructorChaining;

public class Factory {
    String name;
    char category;
    int numberOfWorkers;
    double productionCapacity;
    boolean isAutomated;
    long factoryId;

    Factory() {
        this("Tesla Gigafactory");
    }

    Factory(String name) {
        this('M');
        this.name = name;
    }

    Factory(char category) {
        this(5000);
        this.category = category;
    }

    Factory(int numberOfWorkers) {
        this(250.75);
        this.numberOfWorkers = numberOfWorkers;
    }

    Factory(double productionCapacity) {
        this(true);
        this.productionCapacity = productionCapacity;
    }

    Factory(boolean isAutomated) {
        this(9876543210123L);
        this.isAutomated = isAutomated;
    }

    Factory(long factoryId) {
        this("Ford Assembly Plant", 300.50);
        this.factoryId = factoryId;
    }

    Factory(String name, double productionCapacity) {
        this.name = name;
        this.productionCapacity = productionCapacity;
    }

    public void displayInfo() {
        System.out.println("Factory Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Number of Workers: " + numberOfWorkers);
        System.out.println("Production Capacity: " + productionCapacity + " units/day");
        System.out.println("Is Automated: " + isAutomated);
        System.out.println("Factory ID: " + factoryId);
    }

    public static void main(String[] args) {
        Factory ref1 = new Factory();
        ref1.displayInfo();
    }
}
