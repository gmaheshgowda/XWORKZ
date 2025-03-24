class BubbleGum
{
		 String flavor;
		 String brand;
		 double price;
	BubbleGum(){
		System.out.println("\n BubbleGum No argument constructor is invoked:-");
	}
	
	 BubbleGum(String flavor , String brand , double price){
		 this.flavor = flavor;
		 this.brand = brand;
		 this.price = price;
		 
		 System.out.println("\n BubbleGum Parameterized constructor is invoked:-");
	 }
	 

}