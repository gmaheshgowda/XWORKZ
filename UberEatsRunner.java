package IfElse;

public class UberEatsRunner {

    public static void main(String[] args) {
        String item = "French Fries"; 
        double price = UberEats.searchItem(item);
        
        if (price != -1) 
        {
            System.out.println("The price of " + item + " is ₹" + price);
        }
    }
    
}
