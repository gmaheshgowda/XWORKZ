package ConstructorChaining;

public class Road {
    String name;
    char category;
    int length;
    double width;
    boolean isHighway;
    long roadId;

    Road() {
        this("Sunset Boulevard");
    }

    Road(String name) {
        this('A');
        this.name = name;
    }

    Road(char category) {
        this(120);
        this.category = category;
    }

    Road(int length) {
        this(7.5);
        this.length = length;
    }

    Road(double width) {
        this(true);
        this.width = width;
    }

    Road(boolean isHighway) {
        this(9876543210123L);
        this.isHighway = isHighway;
    }

    Road(long roadId) {
        this("Broadway", 10.2);
        this.roadId = roadId;
    }

    Road(String name, double width) {
        this.name = name;
        this.width = width;
    }

    public void displayInfo() {
        System.out.println("Road Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Length: " + length + " km");
        System.out.println("Width: " + width + " meters");
        System.out.println("Is Highway: " + isHighway);
        System.out.println("Road ID: " + roadId);
    }

    public static void main(String[] args) {
        Road ref1 = new Road();
        ref1.displayInfo();
    }
}

