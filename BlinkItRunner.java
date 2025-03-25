package IfElse;

public class BlinkItRunner {

    public static void main(String[] args) {
        String item = "Kaju Katli"; 
        double price = BlinkIt.searchItem(item);
        
        if (price != -1) 
        {
            System.out.println("The price of " + item + " is ₹" + price);
        }
    }
    
}
