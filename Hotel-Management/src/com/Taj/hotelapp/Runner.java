package com.Taj.hotelapp;

import com.Taj.hotelapp.hotel.Hotel;
import com.Taj.hotelapp.menu.Menu;

public class Runner {
    public static void main(String[] args) {
        System.out.println("main started");
       String [] branches = {"Banglore","Hyderabad","Chennai"};
       String []ingredients1 = {"water","Milk","sugar","TeaPowder"};
        String []ingredients2 = {"water","vegetables","oil","rice"};

        Menu menus[] = new Menu[2];
        Menu menu1 = new Menu();
        menu1.menuName="Tea";
        menu1.menuId=1;
        menu1.ingredients = ingredients1;

        Menu menu2 = new Menu();
        menu2.menuName="vegBiriyani";
        menu2.menuId = 2;
        menu2.ingredients = ingredients2;
        menus[0] = menu1;
        menus[1]=menu2;

        Hotel ref1 = new Hotel();
        ref1.hotelid = 1;
        ref1.hotelName="taj";
        ref1.location="hyderabad";
        ref1.menus=menus;
        ref1.displayinfo();
        System.out.println("main ended");
    }
}
