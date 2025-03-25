package ConstructorChaining;

public class Glass {
    String brand;
    char grade;
    int thickness;
    double transparency;
    boolean isTempered;
    long productId;

    Glass() {
        this("CrystalClear");
    }

    Glass(String brand) {
        this('A');
        this.brand = brand;
    }

    Glass(char grade) {
        this(10);
        this.grade = grade;
    }

    Glass(int thickness) {
        this(95.5);
        this.thickness = thickness;
    }

    Glass(double transparency) {
        this(true);
        this.transparency = transparency;
    }

    Glass(boolean isTempered) {
        this(9876543210123L);
        this.isTempered = isTempered;
    }

    Glass(long productId) {
        this("PureView", 92.3);
        this.productId = productId;
    }

    Glass(String brand, double transparency) {
        this.brand = brand;
        this.transparency = transparency;
    }

    public void displayInfo() {
        System.out.println("Glass Brand: " + brand);
        System.out.println("Glass Grade: " + grade);
        System.out.println("Glass Thickness: " + thickness + " mm");
        System.out.println("Transparency: " + transparency + " %");
        System.out.println("Is Tempered: " + isTempered);
        System.out.println("Product ID: " + productId);
    }

    public static void main(String[] args) {
        Glass ref1 = new Glass();
        ref1.displayInfo();
    }
}
