package ConstructorChaining;

public class Flags {
    String country;
    char symbol;
    int numberOfColors;
    double height;
    boolean isNationalFlag;
    long flagId;

    Flags() {
        this("United States");
    }

    Flags(String country) {
        this('★');
        this.country = country;
    }

    Flags(char symbol) {
        this(3);
        this.symbol = symbol;
    }

    Flags(int numberOfColors) {
        this(1.5);
        this.numberOfColors = numberOfColors;
    }

    Flags(double height) {
        this(true);
        this.height = height;
    }

    Flags(boolean isNationalFlag) {
        this(9876543210123L);
        this.isNationalFlag = isNationalFlag;
    }

    Flags(long flagId) {
        this("Canada", 2.0);
        this.flagId = flagId;
    }

    Flags(String country, double height) {
        this.country = country;
        this.height = height;
    }

    public void displayInfo() {
        System.out.println("Country: " + country);
        System.out.println("Symbol: " + symbol);
        System.out.println("Number of Colors: " + numberOfColors);
        System.out.println("Height: " + height + " meters");
        System.out.println("Is National Flag: " + isNationalFlag);
        System.out.println("Flag ID: " + flagId);
    }

    public static void main(String[] args) {
        Flags ref1 = new Flags();
        ref1.displayInfo();
    }
}

