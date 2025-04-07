package com.supermarket.app.products;

public class Product {
    public int productid;
    public String productname;
   public String ingredients[];

   public void displayproduct()
   {
       System.out.println("display product started ->->");
       System.out.println("producct id is : "+productid);
       System.out.println("product name is : "+productname);
       for(String ing :ingredients)
       {
           System.out.println(ing);
       }
       System.out.println("dispalay product ended ->->");
   }
}
