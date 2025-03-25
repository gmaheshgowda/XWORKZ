
package ConstructorChaining;

public class Weapons {
    String name;
    char category;
    int range;
    double weight;
    boolean isAutomatic;
    long serialNumber;

    Weapons() {
        this("AK-47");
    }

    Weapons(String name) {
        this('F');
        this.name = name;
    }

    Weapons(char category) {
        this(500);
        this.category = category;
    }

    Weapons(int range) {
        this(3.47);
        this.range = range;
    }

    Weapons(double weight) {
        this(true);
        this.weight = weight;
    }

    Weapons(boolean isAutomatic) {
        this(9876543210123L);
        this.isAutomatic = isAutomatic;
    }

    Weapons(long serialNumber) {
        this("M4 Carbine", 2.88);
        this.serialNumber = serialNumber;
    }

    Weapons(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void displayInfo() {
        System.out.println("Weapon Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Range: " + range + " meters");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Is Automatic: " + isAutomatic);
        System.out.println("Serial Number: " + serialNumber);
    }

    public static void main(String[] args) {
        Weapons ref1 = new Weapons();
        ref1.displayInfo();
    }
}
