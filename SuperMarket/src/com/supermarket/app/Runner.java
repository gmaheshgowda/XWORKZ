package com.supermarket.app;

import com.supermarket.app.Supermarket.SuperMarket;
import com.supermarket.app.products.Product;
import com.supermarket.app.sections.Section;

public class Runner {
    public static void main(String[] args) {
     System.out.println("main Started ->->");
       String ingredients[] = {"fruits","water","ice","sugar"};
       String ingredients2[] = {"Biryanileaves","masalapowders","pepper","salt"};
        Product products[] = new Product[3];
        Product pro1 = new Product();
        pro1.productid = 2;
        pro1.productname = "fruitjuice";
        pro1.ingredients=ingredients;

        Product pro2 = new Product();
        pro1.productid = 3;
        pro1.productname = "biryaniIngredients";
        pro1.ingredients=ingredients2;

        products[0]=pro1;
        products[1]=pro2;

        Section sections[] = new Section[3];
        Section sc1 = new Section();
        sc1.secName = "kitchensection";
        sc1.secType = "cooking";
        sc1.products=products;
        sections[0] = sc1;

        SuperMarket sup1 = new SuperMarket();
        sup1.nameOfmarket = "Dmart";
        sup1.location = "location";
        sup1.sections = sections;
        sup1.displaySupermarket();

     System.out.println("main ended ->->");

    }
}
