class CarryBag 
{
    String material;
    String size;
    double price;
        CarryBag() {
        System.out.println("\n CarryBag No-argument constructor is invoked:");
    }

    CarryBag(String material, String size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
		
		System.out.println("\n CarryBag Parameterized constructor is invoked:");
    }

   
}