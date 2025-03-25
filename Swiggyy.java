package IfElse;
public class Swiggyy{

    public static double searchItem(String item) {
        double price = 0.0;
        
        if (item == "Idli") 
        {
            price = 60.0;
            return price;
        } 
        else if (item == "Dosa") 
        {
            price = 105.9;
            return price;
        } 
        else if (item == "Medu Vada") 
        {
            price = 50.0;
            return price;
        } 
        else if (item == "Uttapam") 
        {
            price = 90.0;
            return price;
        } 
        else if (item == "Pongal") 
        {
            price = 75.0;
            return price;
        } 
        else if (item == "Upma") 
        {
            price = 65.0;
            return price;
        } 
        else if (item == "Appam") 
        {
            price = 85.0;
            return price;
        } 
        else if (item == "Puttu") 
        {
            price = 80.0;
            return price;
        } 
        else if (item == "Kuzhi Paniyaram") 
        {
            price = 70.0;
            return price;
        } 
        else if (item == "Masala Dosa") 
        {
            price = 120.0;
            return price;
        } 
        else if (item == "Rava Dosa") 
        {
            price = 110.0;
            return price;
        } 
        else if (item == "Onion Uttapam") 
        {
            price = 95.0;
            return price;
        } 
        else if (item == "Ghee Roast Dosa") 
        {
            price = 130.0;
            return price;
        } 
        else if (item == "Set Dosa") 
        {
            price = 85.0;
            return price;
        } 
        else if (item == "Neer Dosa") 
        {
            price = 90.0;
            return price;
        } 
        else if (item == "Kanchipuram Idli") 
        {
            price = 75.0;
            return price;
        } 
        else if (item == "Ragi Mudde") 
        {
            price = 70.0;
            return price;
        } 
        else if (item == "Bisibelebath") 
        {
            price = 110.0;
            return price;
        } 
        else if (item == "Puliyogare") 
        {
            price = 80.0;
            return price;
        } 
        else if (item == "Curd Rice") 
        {
            price = 65.0;
            return price;
        } 
        else if (item == "Lemon Rice") 
        {
            price = 70.0;
            return price;
        } 
        else if (item == "Tomato Rice") 
        {
            price = 75.0;
            return price;
        } 
        else if (item == "Sambar Rice") 
        {
            price = 85.0;
            return price;
        } 
        else if (item == "Avial") 
        {
            price = 90.0;
            return price;
        } 
        else if (item == "Poriyal") 
        {
            price = 55.0;
            return price;
        } 
        else if (item == "Kootu") 
        {
            price = 75.0;
            return price;
        } 
        else if (item == "Molagoottal") 
        {
            price = 80.0;
            return price;
        } 
        else if (item == "Rasgulla") 
        {
            price = 90.0;
            return price;
        } 
        else if (item == "Chettinad Chicken") 
        {
            price = 190.0;
            return price;
        } 
        else if (item == "Andhra Chicken Curry") 
        {
            price = 200.0;
            return price;
        } 
        else if (item == "Kerala Fish Curry") 
        {
            price = 220.0;
            return price;
        }
        else if(item == " chapathi and curry")
        {
            price = 458.9;
            return price;
        }
        else if (item == "Mangalorean Fish Curry") 
        {
            price = 230.0;
            return price;
        } 
        else if (item == "Hyderabadi Biryani") 
        {
            price = 250.0;
            return price;
        } 
        else if (item == "Chicken 65") 
        {
            price = 180.0;
            return price;
        } 
        else if (item == "Mutton Sukka") 
        {
            price = 260.0;
            return price;
        } 
        else if (item == "Kori Rotti") 
        {
            price = 210.0;
            return price;
        } 
        else if (item == "Pesarattu") 
        {
            price = 95.0;
            return price;
        } 
        else if (item == "Poornalu") 
        {
            price = 85.0;
            return price;
        } 
        else if (item == "Ada Pradhaman") 
        {
            price = 100.0;
            return price;
        } 
        else if (item == "Payasam") 
        {
            price = 90.0;
            return price;
        } 
        else if (item == "Mysore Pak") 
        {
            price = 80.0;
            return price;
        } 
        else if (item == "Aloo Gobhi") 
        {
            price = 150.0;
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
    
        if (item == "Idli") 
        {
            price = 60.0;
            return price * quantity;
        } 
        else if (item == "Dosa") 
        {
            price = 105.9;
            return price * quantity;
        } 
        else if (item == "Medu Vada") 
        {
            price = 50.0;
            return price * quantity;
        } 
        else if (item == "Uttapam") 
        {
            price = 90.0;
            return price * quantity;
        } 
        else if (item == "Pongal") 
        {
            price = 75.0;
            return price * quantity;
        } 
        else if (item == "Upma") 
        {
            price = 65.0;
            return price * quantity;
        } 
        else if (item == "Appam") 
        {
            price = 85.0;
            return price * quantity;
        } 
        else if (item == "Puttu") 
        {
            price = 80.0;
            return price * quantity;
        } 
        else if (item == "Kuzhi Paniyaram") 
        {
            price = 70.0;
            return price * quantity;
        } 
        else if (item == "Masala Dosa") 
        {
            price = 120.0;
            return price * quantity;
        } 
        else if (item == "Rava Dosa") 
        {
            price = 110.0;
            return price * quantity;
        } 
        else if (item == "Onion Uttapam") 
        {
            price = 95.0;
            return price * quantity;
        } 
        else if (item == "Ghee Roast Dosa") 
        {
            price = 130.0;
            return price * quantity;
        } 
        else if (item == "Set Dosa") 
        {
            price = 85.0;
            return price * quantity;
        } 
        else if (item == "Neer Dosa") 
        {
            price = 90.0;
            return price * quantity;
        } 
        else if (item == "Kanchipuram Idli") 
        {
            price = 75.0;
            return price * quantity;
        } 
        else if (item == "Ragi Mudde") 
        {
            price = 70.0;
            return price * quantity;
        } 
        else if (item == "Bisibelebath") 
        {
            price = 110.0;
            return price * quantity;
        } 
        else if (item == "Puliyogare") 
        {
            price = 80.0;
            return price * quantity;
        } 
        else if (item == "Curd Rice") 
        {
            price = 65.0;
            return price * quantity;
        } 
        else if (item == "Lemon Rice") 
        {
            price = 70.0;
            return price * quantity;
        } 
        else if (item == "Tomato Rice") 
        {
            price = 75.0;
            return price * quantity;
        } 
        else if (item == "Sambar Rice") 
        {
            price = 85.0;
            return price * quantity;
        } 
        else if (item == "Avial") 
        {
            price = 90.0;
            return price * quantity;
        } 
        else if (item == "Poriyal") 
        {
            price = 55.0;
            return price * quantity;
        } 
        else if (item == "Kootu") 
        {
            price = 75.0;
            return price * quantity;
        } 
        else if (item == "Molagoottal") 
        {
            price = 80.0;
            return price * quantity;
        } 
        else if (item == "Rasgulla") 
        {
            price = 90.0;
            return price * quantity;
        } 
        else if (item == "Chettinad Chicken") 
        {
            price = 190.0;
            return price * quantity;
        } 
        else if (item == "Andhra Chicken Curry") 
        {
            price = 200.0;
            return price * quantity;
        } 
        else if (item == "Kerala Fish Curry") 
        {
            price = 220.0;
            return price * quantity;
        }
        else if (item == "chapathi and curry")
        {
            price = 458.9;
            return price * quantity;
        }
        else if (item == "Mangalorean Fish Curry") 
        {
            price = 230.0;
            return price * quantity;
        } 
        else if (item == "Hyderabadi Biryani") 
        {
            price = 250.0;
            return price * quantity;
        } 
        else if (item == "Chicken 65") 
        {
            price = 180.0;
            return price * quantity;
        } 
        else if (item == "Mutton Sukka") 
        {
            price = 260.0;
            return price * quantity;
        } 
        else if (item == "Kori Rotti") 
        {
            price = 210.0;
            return price * quantity;
        } 
        else if (item == "Pesarattu") 
        {
            price = 95.0;
            return price * quantity;
        } 
        else if (item == "Poornalu") 
        {
            price = 85.0;
            return price * quantity;
        } 
        else if (item == "Ada Pradhaman") 
        {
            price = 100.0;
            return price * quantity;
        } 
        else if (item == "Payasam") 
        {
            price = 90.0;
            return price * quantity;
        } 
        else if (item == "Mysore Pak") 
        {
            price = 80.0;
            return price * quantity;
        } 
        else if (item == "Aloo Gobhi") 
        {
            price = 150.0;
            return price * quantity;
        } 
        else 
        {
            System.out.println("Item not found in menu.");
            return -1;
        }
    }    
}
