package com.supermarket.app.sections;

import com.supermarket.app.products.Product;

public class Section {
    public String secName;
    public String  secType;
    public Product products[];

    public void displaysection()
    {
        System.out.println("display section started ->->");
        System.out.println("section name is  : "+secName);
        System.out.println("section type is  : "+secType);
        for(Product pro :products)
        {
            pro.displayproduct();
        }
        System.out.println("display section ended ->->");
    }
}
