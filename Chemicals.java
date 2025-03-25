package ConstructorChaining;

public class Chemicals {
    String name;
    char hazardLevel;
    int boilingPoint;
    double molecularWeight;
    boolean isToxic;
    long chemicalId;

    Chemicals() {
        this("Sulfuric Acid");
    }

    Chemicals(String name) {
        this('H');
        this.name = name;
    }

    Chemicals(char hazardLevel) {
        this(337);
        this.hazardLevel = hazardLevel;
    }

    Chemicals(int boilingPoint) {
        this(98.08);
        this.boilingPoint = boilingPoint;
    }

    Chemicals(double molecularWeight) {
        this(true);
        this.molecularWeight = molecularWeight;
    }

    Chemicals(boolean isToxic) {
        this(1002456789L);
        this.isToxic = isToxic;
    }

    Chemicals(long chemicalId) {
        this("Hydrochloric Acid", 36.46);
        this.chemicalId = chemicalId;
    }

    Chemicals(String name, double molecularWeight) {
        this.name = name;
        this.molecularWeight = molecularWeight;
    }

    public void displayInfo() {
        System.out.println("Chemical Name: " + name);
        System.out.println("Hazard Level: " + hazardLevel);
        System.out.println("Boiling Point: " + boilingPoint + " °C");
        System.out.println("Molecular Weight: " + molecularWeight + " g/mol");
        System.out.println("Is Toxic: " + isToxic);
        System.out.println("Chemical ID: " + chemicalId);
    }

    public static void main(String[] args) {
        Chemicals ref1 = new Chemicals();
        ref1.displayInfo();
    }
}

