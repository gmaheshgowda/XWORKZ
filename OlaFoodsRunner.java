package IfElse;

public class OlaFoodsRunner {
    public static void main(String[] args) {
        String item = "Butter Chicken"; 
        double price = OlaFoods.searchItem(item);
        
        if (price != -1) 
        {
            System.out.println("The price of " + item + " is ₹" + price);
        }
    }
    
}
