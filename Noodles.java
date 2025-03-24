class Noodles 
{
    // No-argument constructor
    Noodles() {
        System.out.println("\n Noodles No-argument constructor is invoked:");
    }

    // Parameterized constructor
    Noodles(String brand, String flavor, double price) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
		
		System.out.println("\n Noodles Parameterized constructor is invoked:");
    }
	
	// Instance variables
    String brand;
    String flavor;
    double price;
}