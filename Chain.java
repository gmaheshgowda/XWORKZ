class Chain 
{
    String material;
    String length;
    double price;
    Chain() {
        System.out.println("\n Chain No-argument constructor is invoked:");
    }

    Chain(String material, String length, double price) {
        this.material = material;
        this.length = length;
        this.price = price;
		
		System.out.println("\n Chain Parameterized constructor is invoked:");
    }

   
}