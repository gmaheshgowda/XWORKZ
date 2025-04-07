package com.Taj.hotelapp.hotel;

import com.Taj.hotelapp.menu.Menu;

public class Hotel {
    public int hotelid;
    public String hotelName;
    public String location;
    public Menu menus[];
    public  String[] branches;

    public void displayinfo()
    {
        System.out.println("display hotel started");
        System.out.println("hotel id is  :"+hotelid);
        System.out.println("hotel name is  :"+hotelName);
        System.out.println("location is  :"+location);
        for(Menu menuit: menus)
        {
            menuit.displaymenu();
        }
        System.out.println("display hotel ended");

    }
}
