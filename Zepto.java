package IfElse;
public class Zepto {

    public static double searchItem(String item) {
        double price = 0.0;

        if (item == "Detergent Powder") 
        {
            price = 250.0;
            return price;
        } 
        else if (item == "Dishwashing Liquid") 
        {
            price = 150.0;
            return price;
        } 
        else if (item == "Tissue Roll Pack") 
        {
            price = 120.0;
            return price;
        } 
        else if (item == "Garbage Bags") 
        {
            price = 100.0;
            return price;
        } 
        else if (item == "Floor Cleaner") 
        {
            price = 180.0;
            return price;
        } 
        else if (item == "Air Freshener") 
        {
            price = 220.0;
            return price;
        } 
        else if (item == "fogg") 
        {
            price = 90.0;
            return price;
        } 
        else if (item == "Mosquito Repellent") 
        {
            price = 170.0;
            return price;
        } 
        else if (item == "Laundry Basket") 
        {
            price = 300.0;
            return price;
        } 
        else if (item == "Cloth Drying Rack") 
        {
            price = 899.0;
            return price;
        } 

        else if (item == "Power Bank") 
        {
            price = 1200.0;
            return price;
        } 
        else if (item == "USB Cable") 
        {
            price = 250.0;
            return price;
        } 
        else if (item == "Wireless Mouse") 
        {
            price = 850.0;
            return price;
        } 
        else if (item == "Earphones") 
        {
            price = 700.0;
            return price;
        } 
        else if (item == "Smart Bulb") 
        {
            price = 999.0;
            return price;
        } 
        else if (item == "Extension Board") 
        {
            price = 450.0;
            return price;
        } 
        else if (item == "Bluetooth Speaker") 
        {
            price = 2500.0;
            return price;
        } 
        else if (item == "Mobile Stand") 
        {
            price = 299.0;
            return price;
        } 
        else if (item == "Laptop Cooling Pad") 
        {
            price = 1300.0;
            return price;
        } 

        // Personal Care
        else if (item == "Shampoo") 
        {
            price = 299.0;
            return price;
        } 
        else if (item == "Face Wash") 
        {
            price = 199.0;
            return price;
        } 
        else if (item == "Body Lotion") 
        {
            price = 399.0;
            return price;
        } 
        else if (item == "Toothpaste") 
        {
            price = 99.0;
            return price;
        } 
        else if (item == "Deodorant") 
        {
            price = 250.0;
            return price;
        } 
        else if (item == "Hair Oil") 
        {
            price = 180.0;
            return price;
        } 
        else if (item == "Shaving Cream") 
        {
            price = 120.0;
            return price;
        } 
        else if (item == "Hand Wash") 
        {
            price = 130.0;
            return price;
        } 

        else if (item == "Notebook") 
        {
            price = 70.0;
            return price;
        } 
        else if (item == "Pen Pack") 
        {
            price = 100.0;
            return price;
        } 
        else if (item == "Sticky Notes") 
        {
            price = 80.0;
            return price;
        } 
        else if (item == "Marker Set") 
        {
            price = 150.0;
            return price;
        } 
        else if (item == "skatee board") 
        {
            price = 36452.0;
            return price;
        } 
        else if (item == "Calculator") 
        {
            price = 450.0;
            return price;
        } 

        // Miscellaneous
        else if (item == "Umbrella") 
        {
            price = 499.0;
            return price;
        } 
        else if (item == "Yoga Mat") 
        {
            price = 1200.0;
            return price;
        } 
        else if (item == "Water Bottle") 
        {
            price = 300.0;
            return price;
        } 
        else if (item == "Travel Pillow") 
        {
            price = 700.0;
            return price;
        } 
        else if (item == "Tote Bag") 
        {
            price = 550.0;
            return price;
        } 

        else 
        {
            System.out.println("Item not found in Zepto inventory.");
            return -1; 
        }
    }

        public static double searchItem(String item, int quantity) {
            double price = 0.0;
    
            if (item == "Detergent Powder") 
            {
                price = 250.0;
                return price * quantity;
            } 
            else if (item == "Dishwashing Liquid") 
            {
                price = 150.0;
                return price * quantity;
            } 
            else if (item == "Tissue Roll Pack") 
            {
                price = 120.0;
                return price * quantity;
            } 
            else if (item == "Garbage Bags") 
            {
                price = 100.0;
                return price * quantity;
            } 
            else if (item == "Floor Cleaner") 
            {
                price = 180.0;
                return price * quantity;
            } 
            else if (item == "Air Freshener") 
            {
                price = 220.0;
                return price * quantity;
            } 
            else if (item == "fogg") 
            {
                price = 90.0;
                return price * quantity;
            } 
            else if (item == "Mosquito Repellent") 
            {
                price = 170.0;
                return price * quantity;
            } 
            else if (item == "Laundry Basket") 
            {
                price = 300.0;
                return price * quantity;
            } 
            else if (item == "Cloth Drying Rack") 
            {
                price = 899.0;
                return price * quantity;
            } 
    
            else if (item == "Power Bank") 
            {
                price = 1200.0;
                return price * quantity;
            } 
            else if (item == "USB Cable") 
            {
                price = 250.0;
                return price * quantity;
            } 
            else if (item == "Wireless Mouse") 
            {
                price = 850.0;
                return price * quantity;
            } 
            else if (item == "Earphones") 
            {
                price = 700.0;
                return price * quantity;
            } 
            else if (item == "Smart Bulb") 
            {
                price = 999.0;
                return price * quantity;
            } 
            else if (item == "Extension Board") 
            {
                price = 450.0;
                return price * quantity;
            } 
            else if (item == "Bluetooth Speaker") 
            {
                price = 2500.0;
                return price * quantity;
            } 
            else if (item == "Mobile Stand") 
            {
                price = 299.0;
                return price * quantity;
            } 
            else if (item == "Laptop Cooling Pad") 
            {
                price = 1300.0;
                return price * quantity;
            } 
    
            // Personal Care
            else if (item == "Shampoo") 
            {
                price = 299.0;
                return price * quantity;
            } 
            else if (item == "Face Wash") 
            {
                price = 199.0;
                return price * quantity;
            } 
            else if (item == "Body Lotion") 
            {
                price = 399.0;
                return price * quantity;
            } 
            else if (item == "Toothpaste") 
            {
                price = 99.0;
                return price * quantity;
            } 
            else if (item == "Deodorant") 
            {
                price = 250.0;
                return price * quantity;
            } 
            else if (item == "Hair Oil") 
            {
                price = 180.0;
                return price * quantity;
            } 
            else if (item == "Shaving Cream") 
            {
                price = 120.0;
                return price * quantity;
            } 
            else if (item == "Hand Wash") 
            {
                price = 130.0;
                return price * quantity;
            } 
    
            // Stationery & Office Supplies
            else if (item == "Notebook") 
            {
                price = 70.0;
                return price * quantity;
            } 
            else if (item == "Pen Pack") 
            {
                price = 100.0;
                return price * quantity;
            } 
            else if (item == "Sticky Notes") 
            {
                price = 80.0;
                return price * quantity;
            } 
            else if (item == "Marker Set") 
            {
                price = 150.0;
                return price * quantity;
            } 
            else if (item == "skatee board") 
            {
                price = 36452.0;
                return price * quantity;
            } 
            else if (item == "Calculator") 
            {
                price = 450.0;
                return price * quantity;
            } 
    
            // Miscellaneous
            else if (item == "Umbrella") 
            {
                price = 499.0;
                return price * quantity;
            } 
            else if (item == "Yoga Mat") 
            {
                price = 1200.0;
                return price * quantity;
            } 
            else if (item == "Water Bottle") 
            {
                price = 300.0;
                return price * quantity;
            } 
            else if (item == "Travel Pillow") 
            {
                price = 700.0;
                return price * quantity;
            } 
            else if (item == "Tote Bag") 
            {
                price = 550.0;
                return price * quantity;
            } 
    
            else 
            {
                System.out.println("Item not found in Zepto inventory.");
                return -1; 
            }
        }
}
    

