package IfElse;
public class Dominos {

    public static double searchItem(String item) {
        double price = 0.0;
        
        if (item == "Margherita Pizza") 
        {
            price = 199.0;
            return price;
        } 
        else if (item == "Farmhouse Pizza") 
        {
            price = 349.0;
            return price;
        } 
        else if (item == "Pepperoni Pizza") 
        {
            price = 399.0;
            return price;
        } 
        else if (item == "Veg Extravaganza") 
        {
            price = 369.0;
            return price;
        } 
        else if (item == "Chicken Dominator") 
        {
            price = 449.0;
            return price;
        } 
        else if (item == "Paneer Makhani Pizza") 
        {
            price = 299.0;
            return price;
        } 
        else if (item == "Mexican Green Wave") 
        {
            price = 319.0;
            return price;
        } 
        else if (item == "Peppy Paneer") 
        {
            price = 329.0;
            return price;
        } 
        else if (item == "Veggie Paradise") 
        {
            price = 289.0;
            return price;
        } 
        else if (item == "Cheese n Corn") 
        {
            price = 269.0;
            return price;
        } 
        else if (item == "Chicken Sausage Pizza") 
        {
            price = 379.0;
            return price;
        } 
        else if (item == "Chicken Golden Delight") 
        {
            price = 419.0;
            return price;
        } 
        else if (item == "Indi Tandoori Paneer") 
        {
            price = 359.0;
            return price;
        } 
        else if (item == "Double Cheese Margherita") 
        {
            price = 299.0;
            return price;
        } 
        else if (item == "Cheese Burst Pizza") 
        {
            price = 429.0;
            return price;
        } 
        else if (item == "Stuffed Garlic Bread") 
        {
            price = 179.0;
            return price;
        } 
        else if (item == "Garlic Breadsticks") 
        {
            price = 149.0;
            return price;
        } 
        else if (item == "Taco Mexicana Veg") 
        {
            price = 169.0;
            return price;
        } 
        else if (item == "Taco Mexicana Non-Veg") 
        {
            price = 199.0;
            return price;
        } 
        else if (item == "Zingy Parcel Veg") 
        {
            price = 49.0;
            return price;
        } 
        else if (item == "Zingy Parcel Chicken") 
        {
            price = 59.0;
            return price;
        } 
        else if (item == "Choco Lava Cake") 
        {
            price = 99.0;
            return price;
        } 
        else if (item == "Butterscotch Mousse Cake") 
        {
            price = 149.0;
            return price;
        } 
        else if (item == "Brownie Fantasy") 
        {
            price = 169.0;
            return price;
        } 
        else if (item == "Pepsi 500ml") 
        {
            price = 60.0;
            return price;
        } 
        else if (item == "Pepsi 1L") 
        {
            price = 90.0;
            return price;
        } 
        else if (item == "Mirinda 500ml") 
        {
            price = 60.0;
            return price;
        } 
        else if (item == "7UP 500ml") 
        {
            price = 60.0;
            return price;
        } 
        else if (item == "Veg Pasta") 
        {
            price = 220.0;
            return price;
        } 
        else if (item == "Non-Veg Pasta") 
        {
            price = 250.0;
            return price;
        } 
        else if (item == "Aloo Gobhi") 
        {
            price = 150.0;
            return price;
        } 
        else if (item == "Chicken Wings Peri Peri") 
        {
            price = 269.0;
            return price;
        } 
        else if (item == "Chicken Meatballs") 
        {
            price = 289.0;
            return price;
        } 
        else if (item == "Veggie Crunch Burger") 
        {
            price = 99.0;
            return price;
        } 
        else if (item == "Chicken Crunch Burger") 
        {
            price = 119.0;
            return price;
        } 
        else if (item == "Paneer Tikka Sandwich") 
        {
            price = 179.0;
            return price;
        } 
        else if (item == "Chicken Tikka Sandwich") 
        {
            price = 199.0;
            return price;
        } 
        else if (item == "Cheesy Jalapeno Dip") 
        {
            price = 49.0;
            return price;
        } 
        else if (item == "Cheesy BBQ Dip") 
        {
            price = 49.0;
            return price;
        } 
        else if (item == "Rasgulla") 
        {
            price = 90.0;
            return price;
        } 
        else 
        {
            System.out.println("Item not found in menu.");
            return -1; 
        }
    }
    public static double searchItem(String item, int quantity) {
        double price = 0.0;
        
        if (item.equals("Margherita Pizza")) 
        {
            price = 199.0;
            return price * quantity;
        } 
        else if (item.equals("Farmhouse Pizza")) 
        {
            price = 349.0;
            return price * quantity;
        } 
        else if (item.equals("Pepperoni Pizza")) 
        {
            price = 399.0;
            return price * quantity;
        } 
        else if (item.equals("Veg Extravaganza")) 
        {
            price = 369.0;
            return price * quantity;
        } 
        else if (item.equals("Chicken Dominator")) 
        {
            price = 449.0;
            return price * quantity;
        } 
        else if (item.equals("Paneer Makhani Pizza")) 
        {
            price = 299.0;
            return price * quantity;
        } 
        else if (item.equals("Mexican Green Wave")) 
        {
            price = 319.0;
            return price * quantity;
        } 
        else if (item.equals("Peppy Paneer")) 
        {
            price = 329.0;
            return price * quantity;
        } 
        else if (item.equals("Veggie Paradise")) 
        {
            price = 289.0;
            return price * quantity;
        } 
        else if (item.equals("Cheese n Corn")) 
        {
            price = 269.0;
            return price * quantity;
        } 
        else if (item.equals("Chicken Sausage Pizza")) 
        {
            price = 379.0;
            return price * quantity;
        } 
        else if (item.equals("Chicken Golden Delight")) 
        {
            price = 419.0;
            return price * quantity;
        } 
        else if (item.equals("Indi Tandoori Paneer")) 
        {
            price = 359.0;
            return price * quantity;
        } 
        else if (item.equals("Double Cheese Margherita")) 
        {
            price = 299.0;
            return price * quantity;
        } 
        else if (item.equals("Cheese Burst Pizza")) 
        {
            price = 429.0;
            return price * quantity;
        } 
        else if (item.equals("Stuffed Garlic Bread")) 
        {
            price = 179.0;
            return price * quantity;
        } 
        else if (item.equals("Garlic Breadsticks")) 
        {
            price = 149.0;
            return price * quantity;
        } 
        else if (item.equals("Taco Mexicana Veg")) 
        {
            price = 169.0;
            return price * quantity;
        } 
        else if (item.equals("Taco Mexicana Non-Veg")) 
        {
            price = 199.0;
            return price * quantity;
        } 
        else if (item.equals("Zingy Parcel Veg")) 
        {
            price = 49.0;
            return price * quantity;
        } 
        else if (item.equals("Zingy Parcel Chicken")) 
        {
            price = 59.0;
            return price * quantity;
        } 
        else if (item.equals("Choco Lava Cake")) 
        {
            price = 99.0;
            return price * quantity;
        } 
        else if (item.equals("Butterscotch Mousse Cake")) 
        {
            price = 149.0;
            return price * quantity;
        } 
        else if (item.equals("Brownie Fantasy")) 
        {
            price = 169.0;
            return price * quantity;
        } 
        else if (item.equals("Pepsi 500ml")) 
        {
            price = 60.0;
            return price * quantity;
        } 
        else if (item.equals("Pepsi 1L")) 
        {
            price = 90.0;
            return price * quantity;
        } 
        else if (item.equals("Mirinda 500ml")) 
        {
            price = 60.0;
            return price * quantity;
        } 
        else if (item.equals("7UP 500ml")) 
        {
            price = 60.0;
            return price * quantity;
        } 
        else if (item.equals("Veg Pasta")) 
        {
            price = 220.0;
            return price * quantity;
        } 
        else if (item.equals("Non-Veg Pasta")) 
        {
            price = 250.0;
            return price * quantity;
        } 
        else if (item.equals("Aloo Gobhi")) 
        {
            price = 150.0;
            return price * quantity;
        } 
        else if (item.equals("Chicken Wings Peri Peri")) 
        {
            price = 269.0;
            return price * quantity;
        } 
        else if (item.equals("Chicken Meatballs")) 
        {
            price = 289.0;
            return price * quantity;
        } 
        else if (item.equals("Veggie Crunch Burger")) 
        {
            price = 99.0;
            return price * quantity;
        } 
        else if (item.equals("Chicken Crunch Burger")) 
        {
            price = 119.0;
            return price * quantity;
        } 
        else if (item.equals("Paneer Tikka Sandwich")) 
        {
            price = 179.0;
            return price * quantity;
        } 
        else if (item.equals("Chicken Tikka Sandwich")) 
        {
            price = 199.0;
            return price * quantity;
        } 
        else if (item.equals("Cheesy Jalapeno Dip")) 
        {
            price = 49.0;
            return price * quantity;
        } 
        else if (item.equals("Cheesy BBQ Dip")) 
        {
            price = 49.0;
            return price * quantity;
        } 
        else if (item.equals("Rasgulla")) 
        {
            price = 90.0;
            return price * quantity;
        } 
        else 
        {
            System.out.println("Item not found in Domino's menu.");
            return -1; 
        }
    }
    

  
}
