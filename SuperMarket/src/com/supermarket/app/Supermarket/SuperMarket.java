package com.supermarket.app.Supermarket;

import com.supermarket.app.sections.Section;

public class SuperMarket {
    public String nameOfmarket;
    public String location;
    public Section sections[];


    public void displaySupermarket()
    {
        System.out.println("display supermarket started ->->");
        System.out.println("name of the market is   : "+nameOfmarket);
        System.out.println("location of the market is  : "+location);
        for(Section sec :sections)
        {
            sec.displaysection();
        }
        System.out.println("display supermarket ended ->->");
    }
}
