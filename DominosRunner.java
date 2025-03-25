package IfElse;

public class DominosRunner {
    public static void main(String[] args) {
        String item = "Margherita Pizza"; 
        double price = Dominos.searchItem(item);
        
        if (price != -1) 
        {
            System.out.println("The price of " + item + " is ₹" + price);
        }
    }
    
}
