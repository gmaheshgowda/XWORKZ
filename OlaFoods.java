package IfElse;
public class OlaFoods {

    public static double searchItem(String item) {
        double price = 0.0;

        if (item == "Butter Chicken") 
        {
            price = 349.0;
            return price;
        } 
        else if (item == "Paneer Butter Masala") 
        {
            price = 299.0;
            return price;
        } 
        else if (item == "Dal Makhani") 
        {
            price = 249.0;
            return price;
        } 
        else if (item == "Shahi Paneer") 
        {
            price = 289.0;
            return price;
        } 
        else if (item == "Chicken Tikka Masala") 
        {
            price = 329.0;
            return price;
        } 
        else if (item == "Chole Bhature") 
        {
            price = 179.0;
            return price;
        } 
        else if (item == "Rajma Chawal") 
        {
            price = 199.0;
            return price;
        } 
        else if (item == "Aloo Paratha") 
        {
            price = 149.0;
            return price;
        } 
        else if (item == "Matar Paneer") 
        {
            price = 269.0;
            return price;
        } 
        else if (item == "Kadhai Chicken") 
        {
            price = 349.0;
            return price;
        } 
        else if (item == "Bhindi Masala") 
        {
            price = 229.0;
            return price;
        } 
        else if (item == "Baingan Bharta") 
        {
            price = 239.0;
            return price;
        } 
        else if (item == "Jeera Aloo") 
        {
            price = 189.0;
            return price;
        } 
        else if (item == "Malai Kofta") 
        {
            price = 289.0;
            return price;
        } 
        else if (item == "Aloo Gobhi") 
        {
            price = 150.0;
            return price;
        } 
        else if (item == "Chicken Korma") 
        {
            price = 369.0;
            return price;
        } 
        else if (item == "Tandoori Roti") 
        {
            price = 40.0;
            return price;
        } 
        else if (item == "Naan") 
        {
            price = 60.0;
            return price;
        } 
        else if (item == "Lachha Paratha") 
        {
            price = 79.0;
            return price;
        } 
        else if (item == "Rumali Roti") 
        {
            price = 50.0;
            return price;
        } 
        else if (item == "Samosa") 
        {
            price = 50.0;
            return price;
        } 
        else if (item == "Kachori") 
        {
            price = 60.0;
            return price;
        } 
        else if (item == "Dahi Bhalla") 
        {
            price = 120.0;
            return price;
        } 
        else if (item == "Aloo Tikki Chaat") 
        {
            price = 130.0;
            return price;
        } 
        else if (item == "Chaat Papdi") 
        {
            price = 140.0;
            return price;
        } 
        else if (item == "Pani Puri") 
        {
            price = 100.0;
            return price;
        } 
        else if (item == "Sev Puri") 
        {
            price = 110.0;
            return price;
        } 
        else if (item == "Dabeli") 
        {
            price = 90.0;
            return price;
        } 
        else if (item == "Vada Pav") 
        {
            price = 80.0;
            return price;
        } 
        else if (item == "Lassi") 
        {
            price = 120.0;
            return price;
        } 
        else if (item == "Masala Chai") 
        {
            price = 60.0;
            return price;
        } 
        else if (item == "Gulab Jamun") 
        {
            price = 80.0;
            return price;
        } 
        else if (item == "Rasgulla") 
        {
            price = 90.0;
            return price;
        } 
        else if (item == "Jalebi") 
        {
            price = 110.0;
            return price;
        } 
        else if (item == "Phirni") 
        {
            price = 130.0;
            return price;
        } 
        else if (item == "Rabri") 
        {
            price = 140.0;
            return price;
        } 
        else if (item == "Falooda") 
        {
            price = 150.0;
            return price;
        } 
        else if (item == "Badam Milk") 
        {
            price = 160.0;
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
    
            if (item == "Butter Chicken") 
            {
                price = 349.0;
                return price * quantity;
            } 
            else if (item == "Paneer Butter Masala") 
            {
                price = 299.0;
                return price * quantity;
            } 
            else if (item == "Dal Makhani") 
            {
                price = 249.0;
                return price * quantity;
            } 
            else if (item == "Shahi Paneer") 
            {
                price = 289.0;
                return price * quantity;
            } 
            else if (item == "Chicken Tikka Masala") 
            {
                price = 329.0;
                return price * quantity;
            } 
            else if (item == "Chole Bhature") 
            {
                price = 179.0;
                return price * quantity;
            } 
            else if (item == "Rajma Chawal") 
            {
                price = 199.0;
                return price * quantity;
            } 
            else if (item == "Aloo Paratha") 
            {
                price = 149.0;
                return price * quantity;
            } 
            else if (item == "Matar Paneer") 
            {
                price = 269.0;
                return price * quantity;
            } 
            else if (item == "Kadhai Chicken") 
            {
                price = 349.0;
                return price * quantity;
            } 
            else if (item == "Bhindi Masala") 
            {
                price = 229.0;
                return price * quantity;
            } 
            else if (item == "Baingan Bharta") 
            {
                price = 239.0;
                return price * quantity;
            } 
            else if (item == "Jeera Aloo") 
            {
                price = 189.0;
                return price * quantity;
            } 
            else if (item == "Malai Kofta") 
            {
                price = 289.0;
                return price * quantity;
            } 
            else if (item == "Aloo Gobhi") 
            {
                price = 150.0;
                return price * quantity;
            } 
            else if (item == "Chicken Korma") 
            {
                price = 369.0;
                return price * quantity;
            } 
            else if (item == "Tandoori Roti") 
            {
                price = 40.0;
                return price * quantity;
            } 
            else if (item == "Naan") 
            {
                price = 60.0;
                return price * quantity;
            } 
            else if (item == "Lachha Paratha") 
            {
                price = 79.0;
                return price * quantity;
            } 
            else if (item == "Rumali Roti") 
            {
                price = 50.0;
                return price * quantity;
            } 
            else if (item == "Samosa") 
            {
                price = 50.0;
                return price * quantity;
            } 
            else if (item == "Kachori") 
            {
                price = 60.0;
                return price * quantity;
            } 
            else if (item == "Dahi Bhalla") 
            {
                price = 120.0;
                return price * quantity;
            } 
            else if (item == "Aloo Tikki Chaat") 
            {
                price = 130.0;
                return price * quantity;
            } 
            else if (item == "Chaat Papdi") 
            {
                price = 140.0;
                return price * quantity;
            } 
            else if (item == "Pani Puri") 
            {
                price = 100.0;
                return price * quantity;
            } 
            else if (item == "Sev Puri") 
            {
                price = 110.0;
                return price * quantity;
            } 
            else if (item == "Dabeli") 
            {
                price = 90.0;
                return price * quantity;
            } 
            else if (item == "Vada Pav") 
            {
                price = 80.0;
                return price * quantity;
            } 
            else if (item == "Lassi") 
            {
                price = 120.0;
                return price * quantity;
            } 
            else if (item == "Masala Chai") 
            {
                price = 60.0;
                return price * quantity;
            } 
            else if (item == "Gulab Jamun") 
            {
                price = 80.0;
                return price * quantity;
            } 
            else if (item == "Rasgulla") 
            {
                price = 90.0;
                return price * quantity;
            } 
            else if (item == "Jalebi") 
            {
                price = 110.0;
                return price * quantity;
            } 
            else if (item == "Phirni") 
            {
                price = 130.0;
                return price * quantity;
            } 
            else if (item == "Rabri") 
            {
                price = 140.0;
                return price * quantity;
            } 
            else if (item == "Falooda") 
            {
                price = 150.0;
                return price * quantity;
            } 
            else if (item == "Badam Milk") 
            {
                price = 160.0;
                return price * quantity;
            } 
            else 
            {
                System.out.println("Item not found in menu.");
                return -1; 
            }
        }
}
    
