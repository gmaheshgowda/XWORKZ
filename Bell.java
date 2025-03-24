class Bell 
{
    
    String type;
    String material;
    double price;

    Bell() {
        System.out.println("\n Bell No-argument constructor is invoked:");
    }

    Bell(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
		
		System.out.println("\n Bell Parameterized constructor is invoked:");
    }

  
}