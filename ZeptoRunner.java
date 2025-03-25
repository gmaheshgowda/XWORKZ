package IfElse;

public class ZeptoRunner {
    public static void main(String[] args) {
        String item = "Power Bank"; 
        double price = Zepto.searchItem(item);
        
        if (price != -1) 
        {
            System.out.println("The price of " + item + " is ₹" + price);
        }
    }
}
