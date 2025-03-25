package IfElse;
public class UberEats {

    public static double searchItem(String item) {
        double price = 0.0;

        if (item == "French Fries") 
        {
            price = 99.0;
            return price;
        } 
        else if (item == "Cheese Balls") 
        {
            price = 149.0;
            return price;
        } 
        else if (item == "Veg Spring Rolls") 
        {
            price = 129.0;
            return price;
        } 
        else if (item == "Chicken Nuggets") 
        {
            price = 199.0;
            return price;
        } 
        else if (item == "Crispy Corn") 
        {
            price = 119.0;
            return price;
        } 
        else if (item == "Nachos with Cheese") 
        {
            price = 179.0;
            return price;
        } 
        else if (item == "Paneer Tikka") 
        {
            price = 229.0;
            return price;
        } 
        else if (item == "Chicken Wings") 
        {
            price = 249.0;
            return price;
        } 
        else if (item == "Veg Sandwich") 
        {
            price = 129.0;
            return price;
        } 
        else if (item == "Grilled Chicken Sandwich") 
        {
            price = 169.0;
            return price;
        } 
        else if (item == "Cheese Garlic Bread") 
        {
            price = 149.0;
            return price;
        } 
        else if (item == "Stuffed Mushrooms") 
        {
            price = 199.0;
            return price;
        } 
        else if (item == "Samosa Chaat") 
        {
            price = 99.0;
            return price;
        } 
        else if (item == "Chilli Paneer") 
        {
            price = 229.0;
            return price;
        } 
        else if (item == "Masala Papad") 
        {
            price = 79.0;
            return price;
        } 
        else if (item == "Onion Rings") 
        {
            price = 119.0;
            return price;
        } 
        else if (item == "Fish Fingers") 
        {
            price = 279.0;
            return price;
        } 
        else if (item == "Peri Peri Fries") 
        {
            price = 129.0;
            return price;
        } 
        else if (item == "Dahi Puri") 
        {
            price = 109.0;
            return price;
        } 

        // Drinks
        else if (item == "Cold Coffee") 
        {
            price = 149.0;
            return price;
        } 
        else if (item == "Mango Smoothie") 
        {
            price = 169.0;
            return price;
        } 
        else if (item == "Chocolate Shake") 
        {
            price = 179.0;
            return price;
        } 
        else if (item == "Strawberry Shake") 
        {
            price = 189.0;
            return price;
        } 
        else if (item == "Iced Lemon Tea") 
        {
            price = 119.0;
            return price;
        } 
        else if (item == "Masala Chai") 
        {
            price = 79.0;
            return price;
        } 
        else if (item == "Espresso") 
        {
            price = 99.0;
            return price;
        } 
        else if (item == "Cappuccino") 
        {
            price = 149.0;
            return price;
        } 
        else if (item == "Aloo Gobhi") 
        {
            price = 150.0;
            return price;
        } 
        else if (item == "Rasgulla") 
        {
            price = 90.0;
            return price;
        } 
        else if (item == "Green Tea") 
        {
            price = 89.0;
            return price;
        } 
        else if (item == "Black Coffee") 
        {
            price = 129.0;
            return price;
        } 
        else if (item == "Blueberry Smoothie") 
        {
            price = 179.0;
            return price;
        } 
        else if (item == "Pineapple Juice") 
        {
            price = 139.0;
            return price;
        } 
        else if (item == "Watermelon Juice") 
        {
            price = 129.0;
            return price;
        } 
        else if (item == "Mojito") 
        {
            price = 159.0;
            return price;
        } 
        else if (item == "Virgin Pina Colada") 
        {
            price = 199.0;
            return price;
        } 
        else if (item == "Fresh Lime Soda") 
        {
            price = 99.0;
            return price;
        } 
        else if (item == "Coconut Water") 
        {
            price = 89.0;
            return price;
        } 
        else if (item == "Energy Drink") 
        {
            price = 199.0;
            return price;
        } 
        else if (item == "Butter Milk") 
        {
            price = 79.0;
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
    
            if (item == "French Fries") 
            {
                price = 99.0;
                return price * quantity;
            } 
            else if (item == "Cheese Balls") 
            {
                price = 149.0;
                return price * quantity;
            } 
            else if (item == "Veg Spring Rolls") 
            {
                price = 129.0;
                return price * quantity;
            } 
            else if (item == "Chicken Nuggets") 
            {
                price = 199.0;
                return price * quantity;
            } 
            else if (item == "Crispy Corn") 
            {
                price = 119.0;
                return price * quantity;
            } 
            else if (item == "Nachos with Cheese") 
            {
                price = 179.0;
                return price * quantity;
            } 
            else if (item == "Paneer Tikka") 
            {
                price = 229.0;
                return price * quantity;
            } 
            else if (item == "Chicken Wings") 
            {
                price = 249.0;
                return price * quantity;
            } 
            else if (item == "Veg Sandwich") 
            {
                price = 129.0;
                return price * quantity;
            } 
            else if (item == "Grilled Chicken Sandwich") 
            {
                price = 169.0;
                return price * quantity;
            } 
            else if (item == "Cheese Garlic Bread") 
            {
                price = 149.0;
                return price * quantity;
            } 
            else if (item == "Stuffed Mushrooms") 
            {
                price = 199.0;
                return price * quantity;
            } 
            else if (item == "Samosa Chaat") 
            {
                price = 99.0;
                return price * quantity;
            } 
            else if (item == "Chilli Paneer") 
            {
                price = 229.0;
                return price * quantity;
            } 
            else if (item == "Masala Papad") 
            {
                price = 79.0;
                return price * quantity;
            } 
            else if (item == "Onion Rings") 
            {
                price = 119.0;
                return price * quantity;
            } 
            else if (item == "Fish Fingers") 
            {
                price = 279.0;
                return price * quantity;
            } 
            else if (item == "Peri Peri Fries") 
            {
                price = 129.0;
                return price * quantity;
            } 
            else if (item == "Dahi Puri") 
            {
                price = 109.0;
                return price * quantity;
            } 
    
            else if (item == "Cold Coffee") 
            {
                price = 149.0;
                return price * quantity;
            } 
            else if (item == "Mango Smoothie") 
            {
                price = 169.0;
                return price * quantity;
            } 
            else if (item == "Chocolate Shake") 
            {
                price = 179.0;
                return price * quantity;
            } 
            else if (item == "Strawberry Shake") 
            {
                price = 189.0;
                return price * quantity;
            } 
            else if (item == "Iced Lemon Tea") 
            {
                price = 119.0;
                return price * quantity;
            } 
            else if (item == "Masala Chai") 
            {
                price = 79.0;
                return price * quantity;
            } 
            else if (item == "Espresso") 
            {
                price = 99.0;
                return price * quantity;
            } 
            else if (item == "Cappuccino") 
            {
                price = 149.0;
                return price * quantity;
            } 
            else if (item == "Aloo Gobhi") 
            {
                price = 150.0;
                return price * quantity;
            } 
            else if (item == "Rasgulla") 
            {
                price = 90.0;
                return price * quantity;
            } 
            else if (item == "Green Tea") 
            {
                price = 89.0;
                return price * quantity;
            } 
            else if (item == "Black Coffee") 
            {
                price = 129.0;
                return price * quantity;
            } 
            else if (item == "Blueberry Smoothie") 
            {
                price = 179.0;
                return price * quantity;
            } 
            else if (item == "Pineapple Juice") 
            {
                price = 139.0;
                return price * quantity;
            } 
            else if (item == "Watermelon Juice") 
            {
                price = 129.0;
                return price * quantity;
            } 
            else if (item == "Mojito") 
            {
                price = 159.0;
                return price * quantity;
            } 
            else if (item == "Virgin Pina Colada") 
            {
                price = 199.0;
                return price * quantity;
            } 
            else if (item == "Fresh Lime Soda") 
            {
                price = 99.0;
                return price * quantity;
            } 
            else if (item == "Coconut Water") 
            {
                price = 89.0;
                return price * quantity;
            } 
            else if (item == "Energy Drink") 
            {
                price = 199.0;
                return price * quantity;
            } 
            else if (item == "Butter Milk") 
            {
                price = 79.0;
                return price * quantity;
            } 
            else 
            {
                System.out.println("Item not found in menu.");
                return -1; 
            }
        }
    }
    
