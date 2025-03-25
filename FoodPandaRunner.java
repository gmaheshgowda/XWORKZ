package IfElse;

public class FoodPandaRunner {
    public static void main(String[] args) {
        String item = "Dal Baati Churma";
        double price = FoodPanda.searchItem(item);
        
        if (price != -1) 
        {
            System.out.println("The price of " + item + " is ₹" + price);
        }
    }
    
}
