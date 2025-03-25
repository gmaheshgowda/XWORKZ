package IfElse;
public class FoodPanda {

    public static double searchItem(String item) {
        double price = 0.0;

        if (item == "Ragi Dosa") 
        {
            price = 110.0;
            return price;
        } 
        else if (item == "Neer Dosa") 
        {
            price = 100.0;
            return price;
        } 
        else if (item == "Appam with Stew") 
        {
            price = 140.0;
            return price;
        } 
        else if (item == "Rasam Rice") 
        {
            price = 120.0;
            return price;
        } 
        else if (item == "Curd Rice") 
        {
            price = 90.0;
            return price;
        } 
        else if (item == "Shahi Paneer") 
        {
            price = 240.0;
            return price;
        } 
        else if (item == "Rajma Chawal") 
        {
            price = 160.0;
            return price;
        } 
        else if (item == "Baingan Bharta") 
        {
            price = 180.0;
            return price;
        } 
        else if (item == "Palak Paneer") 
        {
            price = 200.0;
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
        else if (item == "Vada Pav") 
        {
            price = 50.0;
            return price;
        } 
        else if (item == "Sev Puri") 
        {
            price = 75.0;
            return price;
        } 
        else if (item == "Dabeli") 
        {
            price = 60.0;
            return price;
        } 
        else if (item == "Misal Pav") 
        {
            price = 120.0;
            return price;
        } 
        else if (item == "Egg Roll") 
        {
            price = 130.0;
            return price;
        } 
        else if (item == "Mutton Biryani") 
        {
            price = 320.0;
            return price;
        } 
        else if (item == "Chicken Biryani") 
        {
            price = 280.0;
            return price;
        } 
        else if (item == "Vegetable Pulao") 
        {
            price = 160.0;
            return price;
        } 
        else if (item == "Jeera Rice") 
        {
            price = 130.0;
            return price;
        } 
        else if (item == "Khichdi") 
        {
            price = 140.0;
            return price;
        } 
        else if (item == "Filter Coffee") 
        {
            price = 50.0;
            return price;
        } 
        else if (item == "Jaljeera") 
        {
            price = 60.0;
            return price;
        } 
        else if (item == "Buttermilk") 
        {
            price = 40.0;
            return price;
        } 
        else if (item == "Sugarcane Juice") 
        {
            price = 80.0;
            return price;
        } 
        else if (item == "Thandai") 
        {
            price = 100.0;
            return price;
        } 
        else if (item == "Kheer") 
        {
            price = 140.0;
            return price;
        } 
        else if (item == "Rasmalai") 
        {
            price = 180.0;
            return price;
        } 
        else if (item == "Shrikhand") 
        {
            price = 200.0;
            return price;
        } 
        else if (item == "Pineapple Halwa") 
        {
            price = 160.0;
            return price;
        } 
        else if (item == "Chocolate Kulfi") 
        {
            price = 120.0;
            return price;
        } 
        else if (item == "Dal Baati Churma") 
        {
            price = 250.0;
            return price;
        } 
        else if (item == "Thepla") 
        {
            price = 100.0;
            return price;
        } 
        else if (item == "Sarson Ka Saag with Makki Roti") 
        {
            price = 180.0;
            return price;
        } 
        else 
        {
            System.out.println("Item not found in FoodPanda menu.");
            return -1;
        }
    }
        public static double searchItem(String item, int quantity) {
            double price = 0.0;
    
            if (item.equals("Ragi Dosa")) 
            {
                price = 110.0;
                return price * quantity;
            } 
            else if (item.equals("Neer Dosa")) 
            {
                price = 100.0;
                return price * quantity;
            } 
            else if (item.equals("Appam with Stew")) 
            {
                price = 140.0;
                return price * quantity;
            } 
            else if (item.equals("Rasam Rice")) 
            {
                price = 120.0;
                return price * quantity;
            } 
            else if (item.equals("Curd Rice")) 
            {
                price = 90.0;
                return price * quantity;
            } 
            else if (item.equals("Shahi Paneer")) 
            {
                price = 240.0;
                return price * quantity;
            } 
            else if (item.equals("Rajma Chawal")) 
            {
                price = 160.0;
                return price * quantity;
            } 
            else if (item.equals("Baingan Bharta")) 
            {
                price = 180.0;
                return price * quantity;
            } 
            else if (item.equals("Palak Paneer")) 
            {
                price = 200.0;
                return price * quantity;
            } 
            else if (item.equals("Aloo Gobhi")) 
            {
                price = 150.0;
                return price * quantity;
            } 
            else if (item.equals("Rasgulla")) 
            {
                price = 90.0;
                return price * quantity;
            } 
            else if (item.equals("Vada Pav")) 
            {
                price = 50.0;
                return price * quantity;
            } 
            else if (item.equals("Sev Puri")) 
            {
                price = 75.0;
                return price * quantity;
            } 
            else if (item.equals("Dabeli")) 
            {
                price = 60.0;
                return price * quantity;
            } 
            else if (item.equals("Misal Pav")) 
            {
                price = 120.0;
                return price * quantity;
            } 
            else if (item.equals("Egg Roll")) 
            {
                price = 130.0;
                return price * quantity;
            } 
            else if (item.equals("Mutton Biryani")) 
            {
                price = 320.0;
                return price * quantity;
            } 
            else if (item.equals("Chicken Biryani")) 
            {
                price = 280.0;
                return price * quantity;
            } 
            else if (item.equals("Vegetable Pulao")) 
            {
                price = 160.0;
                return price * quantity;
            } 
            else if (item.equals("Jeera Rice")) 
            {
                price = 130.0;
                return price * quantity;
            } 
            else if (item.equals("Khichdi")) 
            {
                price = 140.0;
                return price * quantity;
            } 
            else if (item.equals("Filter Coffee")) 
            {
                price = 50.0;
                return price * quantity;
            } 
            else if (item.equals("Jaljeera")) 
            {
                price = 60.0;
                return price * quantity;
            } 
            else if (item.equals("Buttermilk")) 
            {
                price = 40.0;
                return price * quantity;
            } 
            else if (item.equals("Sugarcane Juice")) 
            {
                price = 80.0;
                return price * quantity;
            } 
            else if (item.equals("Thandai")) 
            {
                price = 100.0;
                return price * quantity;
            } 
            else if (item.equals("Kheer")) 
            {
                price = 140.0;
                return price * quantity;
            } 
            else if (item.equals("Rasmalai")) 
            {
                price = 180.0;
                return price * quantity;
            } 
            else if (item.equals("Shrikhand")) 
            {
                price = 200.0;
                return price * quantity;
            } 
            else if (item.equals("Pineapple Halwa")) 
            {
                price = 160.0;
                return price * quantity;
            } 
            else if (item.equals("Chocolate Kulfi")) 
            {
                price = 120.0;
                return price * quantity;
            } 
            else if (item.equals("Dal Baati Churma")) 
            {
                price = 250.0;
                return price * quantity;
            } 
            else if (item.equals("Thepla")) 
            {
                price = 100.0;
                return price * quantity;
            } 
            else if (item.equals("Sarson Ka Saag with Makki Roti")) 
            {
                price = 180.0;
                return price * quantity;
            } 
            else 
            {
                System.out.println("Item not found in FoodPanda menu.");
                return -1; 
            }
    }
}
    

