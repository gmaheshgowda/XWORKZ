package IfElse;

public class SwiggyRunner {
    public static void main(String[] args) {
        String item = "Dosa"; 
        double price = Swiggyy.searchItem(item);
        
        if (price != -1) 
        {
            System.out.println("The price of " + item + " is ₹" + price);
        }
      
    }
    
}
